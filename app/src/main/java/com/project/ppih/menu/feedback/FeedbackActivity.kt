package com.project.ppih.menu.feedback

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.project.ppih.databinding.ActivityFeedbackBinding

class FeedbackActivity : AppCompatActivity() {

    private var binding: ActivityFeedbackBinding? = null
    private var adapter: FeedbackAdapter? = null

    override fun onResume() {
        super.onResume()
        initRecyclerView()
        initViewModel()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFeedbackBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        val prefs = getSharedPreferences(
            "com.project.ppih", Context.MODE_PRIVATE
        )
        val status = prefs.getBoolean("active", false)

        if (!status) {
            binding?.addFeedback?.visibility = View.VISIBLE
        }


        binding?.addFeedback?.setOnClickListener {
            prefs.edit().putBoolean("active", true).apply()
            startActivity(Intent(this, FeedbackAddActivity::class.java))
        }
    }

    private fun initRecyclerView() {
        binding?.rvFeedback?.layoutManager = LinearLayoutManager(this)
        adapter = FeedbackAdapter()
        binding?.rvFeedback?.adapter = adapter
    }

    private fun initViewModel() {
        val viewModel = ViewModelProvider(this)[FeedbackViewModel::class.java]

        binding?.progressBar?.visibility = View.VISIBLE
        viewModel.setListFeedback()
        viewModel.getFeedbackList().observe(this) { feedback ->
            if (feedback.size > 0) {
                adapter!!.setData(feedback)
                binding?.noData?.visibility = View.GONE
            } else {
                binding?.noData?.visibility = View.VISIBLE
            }
            binding!!.progressBar.visibility = View.GONE
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}