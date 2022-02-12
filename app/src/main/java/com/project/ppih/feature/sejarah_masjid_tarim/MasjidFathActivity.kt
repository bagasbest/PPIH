package com.project.ppih.feature.sejarah_masjid_tarim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.project.ppih.R
import com.project.ppih.databinding.ActivityMasjidFathBinding

class MasjidFathActivity : AppCompatActivity() {

    private var binding: ActivityMasjidFathBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMasjidFathBinding.inflate(layoutInflater)
        setContentView(binding?.root)


        Glide.with(this)
            .load(R.drawable.masjid_fath)
            .into(binding!!.masjidFath)
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}