package com.project.ppih.feature.instansi_pendidikan_di_hadhramaut

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.project.ppih.R
import com.project.ppih.databinding.ActivityUniversitasWasathiyahBinding

class UniversitasWasathiyahActivity : AppCompatActivity() {

    private var binding: ActivityUniversitasWasathiyahBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUniversitasWasathiyahBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        Glide.with(this)
            .load(R.drawable.universitas_wasathiyah)
            .into(binding!!.universitasWasathiyah)


    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}