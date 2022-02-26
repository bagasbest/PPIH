package com.project.ppih.feature.instansi_pendidikan_di_hadhramaut

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.project.ppih.R
import com.project.ppih.databinding.ActivityRibathTarimBinding

class RibathTarimActivity : AppCompatActivity() {

    private var binding: ActivityRibathTarimBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRibathTarimBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        Glide.with(this)
            .load(R.drawable.ribath_tarim)
            .into(binding!!.ribathTarim)

    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}