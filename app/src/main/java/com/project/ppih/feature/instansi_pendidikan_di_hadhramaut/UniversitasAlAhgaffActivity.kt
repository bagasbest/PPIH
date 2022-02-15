package com.project.ppih.feature.instansi_pendidikan_di_hadhramaut

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.project.ppih.R
import com.project.ppih.databinding.ActivityUniversitasAlAhgaffBinding

class UniversitasAlAhgaffActivity : AppCompatActivity() {

    private var binding: ActivityUniversitasAlAhgaffBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUniversitasAlAhgaffBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        Glide.with(this)
            .load(R.drawable.universitas_alahgaff)
            .into(binding!!.universitasAlahgaff)


    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}