package com.project.ppih.feature.dzikir_dan_maulid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.ppih.databinding.ActivityF2HomeBinding

class F2HomeActivity : AppCompatActivity() {

    private var binding: ActivityF2HomeBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityF2HomeBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.view?.setOnClickListener {
            val intent = Intent(this, PDFActivity::class.java)
            intent.putExtra(PDFActivity.EXTRA_TITLE, "Doa - Doa")
            intent.putExtra(PDFActivity.EXTRA_PDF, "doa_doa.pdf")
            startActivity(intent)
        }

        binding?.view2?.setOnClickListener {
            val intent = Intent(this, PDFActivity::class.java)
            intent.putExtra(PDFActivity.EXTRA_TITLE, "Al - Kahfi")
            intent.putExtra(PDFActivity.EXTRA_PDF, "alkahfi.pdf")
            startActivity(intent)
        }

        binding?.view3?.setOnClickListener {
            val intent = Intent(this, PDFActivity::class.java)
            intent.putExtra(PDFActivity.EXTRA_TITLE, "Dzikir Setelah Shalat")
            intent.putExtra(PDFActivity.EXTRA_PDF, "dzikir_setelah_solat.pdf")
            startActivity(intent)
        }

        binding?.view4?.setOnClickListener {
            val intent = Intent(this, PDFActivity::class.java)
            intent.putExtra(PDFActivity.EXTRA_TITLE, "Maulid Ad-Dibai")
            intent.putExtra(PDFActivity.EXTRA_PDF, "maulid_ad_dibai.pdf")
            startActivity(intent)
        }

        binding?.view5?.setOnClickListener {
            val intent = Intent(this, PDFActivity::class.java)
            intent.putExtra(PDFActivity.EXTRA_TITLE, "Ratibul Attas")
            intent.putExtra(PDFActivity.EXTRA_PDF, "ratibul_attas.pdf")
            startActivity(intent)
        }

        binding?.view6?.setOnClickListener {
            val intent = Intent(this, PDFActivity::class.java)
            intent.putExtra(PDFActivity.EXTRA_TITLE, "Ratibul Hadad")
            intent.putExtra(PDFActivity.EXTRA_PDF, "ratibul_hadad.pdf")
            startActivity(intent)
        }

        binding?.view7?.setOnClickListener {
            val intent = Intent(this, PDFActivity::class.java)
            intent.putExtra(PDFActivity.EXTRA_TITLE, "Surah Yasin")
            intent.putExtra(PDFActivity.EXTRA_PDF, "surah_yasin.pdf")
            startActivity(intent)
        }

        binding?.view8?.setOnClickListener {
            val intent = Intent(this, PDFActivity::class.java)
            intent.putExtra(PDFActivity.EXTRA_TITLE, "Wirdul Latif")
            intent.putExtra(PDFActivity.EXTRA_PDF, "wirdul_latif.pdf")
            startActivity(intent)
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}