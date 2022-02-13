package com.project.ppih.feature.sejarah_masjid_tarim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.project.ppih.R
import com.project.ppih.databinding.ActivityMasjidAlMuhdhorBinding

class MasjidAlMuhdhorActivity : AppCompatActivity() {

    private var binding: ActivityMasjidAlMuhdhorBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMasjidAlMuhdhorBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        Glide.with(this)
            .load(R.drawable.masjid_almuhdhor)
            .into(binding!!.masjidAlmuhdhor)


    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}