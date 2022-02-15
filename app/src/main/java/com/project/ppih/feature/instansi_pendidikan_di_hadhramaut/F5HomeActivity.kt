package com.project.ppih.feature.instansi_pendidikan_di_hadhramaut

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.ppih.databinding.ActivityF5HomeBinding

class F5HomeActivity : AppCompatActivity() {

    private var binding: ActivityF5HomeBinding ? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityF5HomeBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.view2?.setOnClickListener {
            startActivity(Intent(this, RibathIlmiSyarifSeiyunActivity::class.java))
        }

        binding?.view3?.setOnClickListener {
            startActivity(Intent(this, UniversitasAlAhgaffActivity::class.java))
        }

        binding?.view4?.setOnClickListener {
            startActivity(Intent(this, DarulMustafaActivity::class.java))
        }

        binding?.view5?.setOnClickListener {
            startActivity(Intent(this, DaruzZahraActivity::class.java))
        }

        binding?.view6?.setOnClickListener {
            startActivity(Intent(this, UniversitasWasathiyahActivity::class.java))
        }

        binding?.view7?.setOnClickListener {
            startActivity(Intent(this, RibathAlFathWalImdadActivity::class.java))
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}