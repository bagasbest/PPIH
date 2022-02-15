package com.project.ppih.feature.biografi_ulama_hadhramaut

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.ppih.databinding.ActivityF4HomeBinding

class F4HomeActivity : AppCompatActivity() {

    private var binding: ActivityF4HomeBinding ? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityF4HomeBinding.inflate(layoutInflater)
        setContentView(binding?.root)


        binding?.view2?.setOnClickListener {
            startActivity(Intent(this, TarimActivity::class.java))
        }

        binding?.view3?.setOnClickListener {
            startActivity(Intent(this, SeiyunHuraidahAmedActivity::class.java))
        }

        binding?.view4?.setOnClickListener {
            startActivity(Intent(this, MashadDauanActivity::class.java))
        }

        binding?.view?.setOnClickListener {
            startActivity(Intent(this, InatQasamHudActivity::class.java))
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}