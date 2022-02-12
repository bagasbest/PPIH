package com.project.ppih.feature.biografi_ulama_hadhramaut

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.ppih.databinding.ActivityF4HomeBinding

class F4HomeActivity : AppCompatActivity() {

    private var binding: ActivityF4HomeBinding ? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityF4HomeBinding.inflate(layoutInflater)
        setContentView(binding?.root)
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}