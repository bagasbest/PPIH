package com.project.ppih.feature.instansi_pendidikan_di_hadhramaut

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.project.ppih.R
import com.project.ppih.databinding.ActivityF5HomeBinding

class F5HomeActivity : AppCompatActivity() {

    private var binding: ActivityF5HomeBinding ? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityF5HomeBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        Glide.with(this)
            .load(R.drawable.instansi_pendidikan)
            .into(binding!!.instansi)

        Glide.with(this)
            .load(R.drawable.instansi_pendidikan)
            .into(binding!!.instansi2)

        Glide.with(this)
            .load(R.drawable.instansi_pendidikan)
            .into(binding!!.instansi3)

        Glide.with(this)
            .load(R.drawable.instansi_pendidikan)
            .into(binding!!.instansi4)

        Glide.with(this)
            .load(R.drawable.instansi_pendidikan)
            .into(binding!!.instansi5)

        Glide.with(this)
            .load(R.drawable.instansi_pendidikan)
            .into(binding!!.instansi6)

        Glide.with(this)
            .load(R.drawable.instansi_pendidikan)
            .into(binding!!.instansi7)

        Glide.with(this)
            .load(R.drawable.instansi_pendidikan)
            .into(binding!!.instansi8)

        Glide.with(this)
            .load(R.drawable.instansi_pendidikan)
            .into(binding!!.instansi9)

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

        binding?.view8?.setOnClickListener {
            startActivity(Intent(this, MahadAlaydrusActivity::class.java))
        }

        binding?.view?.setOnClickListener {
            startActivity(Intent(this, RibathTarimActivity::class.java))
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}