package com.project.ppih.feature.sejarah_masjid_tarim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.project.ppih.R
import com.project.ppih.databinding.ActivityMasjidJamiBinding

class MasjidJamiActivity : AppCompatActivity() {


    private var binding: ActivityMasjidJamiBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMasjidJamiBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        Glide.with(this)
            .load(R.drawable.masjid_jami)
            .into(binding!!.masjidJami)

    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}