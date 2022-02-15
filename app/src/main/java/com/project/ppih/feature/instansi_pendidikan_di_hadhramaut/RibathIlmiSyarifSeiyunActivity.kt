package com.project.ppih.feature.instansi_pendidikan_di_hadhramaut

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.project.ppih.R
import com.project.ppih.databinding.ActivityRibathIlmiSyarifSeiyunBinding

class RibathIlmiSyarifSeiyunActivity : AppCompatActivity() {

    private var binding: ActivityRibathIlmiSyarifSeiyunBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRibathIlmiSyarifSeiyunBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        Glide.with(this)
            .load(R.drawable.ribath_ilmi_syarif)
            .into(binding!!.ribathIlmiSyarifSeiyum)


    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}