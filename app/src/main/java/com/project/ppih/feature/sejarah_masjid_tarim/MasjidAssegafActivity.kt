package com.project.ppih.feature.sejarah_masjid_tarim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.project.ppih.R
import com.project.ppih.databinding.ActivityMasjidAssegafBinding

class MasjidAssegafActivity : AppCompatActivity() {

    private var binding: ActivityMasjidAssegafBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMasjidAssegafBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        Glide.with(this)
            .load(R.drawable.masjid_assegaf)
            .into(binding!!.masjidAssegaf)

    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}