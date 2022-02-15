package com.project.ppih.feature.biografi_ulama_hadhramaut

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.project.ppih.R
import com.project.ppih.databinding.ActivityMashadDauanBinding

class MashadDauanActivity : AppCompatActivity() {

    private var binding: ActivityMashadDauanBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMashadDauanBinding.inflate(layoutInflater)
        setContentView(binding?.root)


        Glide.with(this)
            .load(R.drawable.mashad1)
            .into(binding!!.mashad1)

        Glide.with(this)
            .load(R.drawable.mashad2)
            .into(binding!!.mashad2)


        Glide.with(this)
            .load(R.drawable.mashad3)
            .into(binding!!.mashad3)
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}