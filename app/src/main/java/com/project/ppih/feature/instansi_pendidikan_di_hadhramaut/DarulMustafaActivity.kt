package com.project.ppih.feature.instansi_pendidikan_di_hadhramaut

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.project.ppih.R
import com.project.ppih.databinding.ActivityDarulMustafaBinding

class DarulMustafaActivity : AppCompatActivity() {

    private var binding: ActivityDarulMustafaBinding? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDarulMustafaBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        Glide.with(this)
            .load(R.drawable.darul_mustofa)
            .into(binding!!.darulMustofa)

    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}