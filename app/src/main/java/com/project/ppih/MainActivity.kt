package com.project.ppih

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.ppih.al_quran.F1HomeActivity
import com.project.ppih.biografi_ulama_hadhramaut.F4HomeActivity
import com.project.ppih.databinding.ActivityMainBinding
import com.project.ppih.dzikir_dan_maulid.F2HomeActivity
import com.project.ppih.instansi_pendidikan_di_hadhramaut.F5HomeActivity
import com.project.ppih.sejarah_masjid_tarim.F3HomeActivity

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        /// Hint: F1, F2, ... F5, maksudnya adalah Fitur 1, Fitur 2 dst, sesuai dengan desain
        binding?.linearLayout?.setOnClickListener {
            startActivity(Intent(this, F1HomeActivity::class.java))
        }


        binding?.f2?.setOnClickListener {
            startActivity(Intent(this, F2HomeActivity::class.java))
        }

        binding?.f3?.setOnClickListener {
            startActivity(Intent(this, F3HomeActivity::class.java))
        }

        binding?.f4?.setOnClickListener {
            startActivity(Intent(this, F4HomeActivity::class.java))
        }

        binding?.f5?.setOnClickListener {
            startActivity(Intent(this, F5HomeActivity::class.java))
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}