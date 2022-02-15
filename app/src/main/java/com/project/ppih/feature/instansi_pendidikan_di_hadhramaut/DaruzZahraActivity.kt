package com.project.ppih.feature.instansi_pendidikan_di_hadhramaut

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.project.ppih.R
import com.project.ppih.databinding.ActivityDaruzZahraBinding

class DaruzZahraActivity : AppCompatActivity() {

    private var binding: ActivityDaruzZahraBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDaruzZahraBinding.inflate(layoutInflater)
        setContentView(binding?.root)


        Glide.with(this)
            .load(R.drawable.darul_zahra)
            .into(binding!!.darulZahra)

    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

}
