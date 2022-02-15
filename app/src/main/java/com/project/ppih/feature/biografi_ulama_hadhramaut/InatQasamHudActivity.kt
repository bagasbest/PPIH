package com.project.ppih.feature.biografi_ulama_hadhramaut

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.ppih.databinding.ActivityInadQasamHudBinding

class InatQasamHudActivity : AppCompatActivity() {

    private var binding: ActivityInadQasamHudBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInadQasamHudBinding.inflate(layoutInflater)
        setContentView(binding?.root)
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}