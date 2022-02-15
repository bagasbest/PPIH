package com.project.ppih.feature.instansi_pendidikan_di_hadhramaut

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.project.ppih.R
import com.project.ppih.databinding.ActivityRibathAlFathWalImdadBinding

class RibathAlFathWalImdadActivity : AppCompatActivity() {

    private var binding: ActivityRibathAlFathWalImdadBinding? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRibathAlFathWalImdadBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        Glide.with(this)
            .load(R.drawable.ribath_fath_wal_imdad)
            .into(binding!!.ribathAlFathWalImdad)


    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}