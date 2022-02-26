package com.project.ppih.feature.instansi_pendidikan_di_hadhramaut

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.project.ppih.R
import com.project.ppih.databinding.ActivityMahadAlaydrusBinding

class MahadAlaydrusActivity : AppCompatActivity() {

    private var binding: ActivityMahadAlaydrusBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMahadAlaydrusBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        Glide.with(this)
            .load(R.drawable.mahad_alaydrus)
            .into(binding!!.mahadAlaydrus)

    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}