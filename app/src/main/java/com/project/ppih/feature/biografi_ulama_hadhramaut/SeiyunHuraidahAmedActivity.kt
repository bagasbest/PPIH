package com.project.ppih.feature.biografi_ulama_hadhramaut

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.project.ppih.R
import com.project.ppih.databinding.ActivitySeiyunHuraidahAmedBinding

class SeiyunHuraidahAmedActivity : AppCompatActivity() {

    private var binding: ActivitySeiyunHuraidahAmedBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySeiyunHuraidahAmedBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        Glide.with(this)
            .load(R.drawable.seiyun1)
            .into(binding!!.seiyun1)

        Glide.with(this)
            .load(R.drawable.seiyun2)
            .into(binding!!.seiyun2)


        Glide.with(this)
            .load(R.drawable.seiyun3)
            .into(binding!!.seiyun3)

        Glide.with(this)
            .load(R.drawable.seiyun4)
            .into(binding!!.seiyun4)

        Glide.with(this)
            .load(R.drawable.seiyun5)
            .into(binding!!.seiyun5)


        Glide.with(this)
            .load(R.drawable.seiyun6)
            .into(binding!!.seiyun6)

        Glide.with(this)
            .load(R.drawable.seiyun7)
            .into(binding!!.seiyun7)


        Glide.with(this)
            .load(R.drawable.seiyun8)
            .into(binding!!.seiyun8)

        Glide.with(this)
            .load(R.drawable.seiyun9)
            .into(binding!!.seiyun9)


        Glide.with(this)
            .load(R.drawable.seiyun10)
            .into(binding!!.seiyun10)
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}