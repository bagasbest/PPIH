package com.project.ppih.feature.instansi_pendidikan_di_hadhramaut

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.ppih.databinding.ActivityDarulMustafaBinding

class DarulMustafaActivity : AppCompatActivity() {

    private var binding: ActivityDarulMustafaBinding? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDarulMustafaBinding.inflate(layoutInflater)
        setContentView(binding?.root)
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}