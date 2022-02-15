package com.project.ppih.feature.biografi_ulama_hadhramaut

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.project.ppih.R
import com.project.ppih.databinding.ActivityTarimBinding

class TarimActivity : AppCompatActivity() {

    private var binding: ActivityTarimBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTarimBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        Glide.with(this)
            .load(R.drawable.faqih_muqaddam)
            .into(binding!!.faqihMuqaddam)

        Glide.with(this)
            .load(R.drawable.alwi_al_ghayur)
            .into(binding!!.alwiAlGhayur)


        Glide.with(this)
            .load(R.drawable.abdullah_ba_alawi)
            .into(binding!!.abdullahBaAlawi)

        Glide.with(this)
            .load(R.drawable.syekh_ali_khali_qasam)
            .into(binding!!.syekhAliKhaliQasam)

        Glide.with(this)
            .load(R.drawable.al_habib_muhammad_jamalullail)
            .into(binding!!.alHabibMuhammadJamalullail)


        Glide.with(this)
            .load(R.drawable.al_habib_umar_al_muhdar)
            .into(binding!!.alHabibUmarAlMuhdar)

        Glide.with(this)
            .load(R.drawable.imam_aydrus)
            .into(binding!!.imamAydrus)


        Glide.with(this)
            .load(R.drawable.imam_abdullah_al_haddad)
            .into(binding!!.imamAbdullahAlHaddad)

        Glide.with(this)
            .load(R.drawable.imam_abdurrahman_as_seggaf)
            .into(binding!!.imamAbdurrahmanAsSeggaf)

        Glide.with(this)
            .load(R.drawable.habib_abdullah_bin_syekh_awsat)
            .into(binding!!.habibAbdullahBinSyekhAwsat)

    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}