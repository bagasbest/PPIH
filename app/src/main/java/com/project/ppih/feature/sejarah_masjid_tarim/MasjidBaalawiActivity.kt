package com.project.ppih.feature.sejarah_masjid_tarim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.project.ppih.R
import com.project.ppih.databinding.ActivityMasjidBaalawiBinding

class MasjidBaalawiActivity : AppCompatActivity() {

    private var binding: ActivityMasjidBaalawiBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMasjidBaalawiBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        Glide.with(this)
            .load(R.drawable.masjid_baalawi)
            .into(binding!!.masjidBaalawi)

        Glide.with(this)
            .load(R.drawable.masjid_baalawi_01)
            .into(binding!!.masjidBaalawi01)

        Glide.with(this)
            .load(R.drawable.masjid_baalawi_02)
            .into(binding!!.masjidBaalawi02)

    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}