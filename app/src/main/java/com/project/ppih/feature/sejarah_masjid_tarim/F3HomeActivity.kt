package com.project.ppih.feature.sejarah_masjid_tarim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.ppih.databinding.ActivityF3HomeBinding

class F3HomeActivity : AppCompatActivity() {
    private var binding: ActivityF3HomeBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityF3HomeBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.view2?.setOnClickListener {
            startActivity(Intent(this, MasjidJamiActivity::class.java))
        }

        binding?.view5?.setOnClickListener {
            startActivity(Intent(this, MasjidFathActivity::class.java))
        }

        binding?.view?.setOnClickListener {
            startActivity(Intent(this, MasjidAssegafActivity::class.java))
        }

        binding?.view3?.setOnClickListener {
            startActivity(Intent(this, MasjidBaalawiActivity::class.java))
        }

        binding?.view4?.setOnClickListener {
            startActivity(Intent(this, MasjidAlMuhdhorActivity::class.java))
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}