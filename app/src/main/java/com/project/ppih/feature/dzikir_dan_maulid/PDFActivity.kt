package com.project.ppih.feature.dzikir_dan_maulid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.ppih.databinding.ActivityPdfactivityBinding

class PDFActivity : AppCompatActivity() {

    private var binding: ActivityPdfactivityBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPdfactivityBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        val title = intent.getStringExtra(EXTRA_TITLE)
        val assetName = intent.getStringExtra(EXTRA_PDF)
        binding?.title?.text = title
        binding?.PDFView?.fromAsset(assetName)?.load()

    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

    companion object {
        const val EXTRA_TITLE = "title"
        const val EXTRA_PDF = "pdf"
    }
}