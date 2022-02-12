package com.project.ppih

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import com.bumptech.glide.Glide
import com.project.ppih.feature.al_quran.F1HomeActivity
import com.project.ppih.feature.biografi_ulama_hadhramaut.F4HomeActivity
import com.project.ppih.databinding.ActivityMainBinding
import com.project.ppih.feature.dzikir_dan_maulid.F2HomeActivity
import com.project.ppih.feature.instansi_pendidikan_di_hadhramaut.F5HomeActivity
import com.project.ppih.feature.sejarah_masjid_tarim.F3HomeActivity
import com.project.ppih.menu.ContactActivity
import com.project.ppih.menu.DonateActivity
import com.project.ppih.menu.ProfileActivity
import com.project.ppih.menu.feedback.FeedbackActivity


class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    override fun onResume() {
        super.onResume()
        populateHeader()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        /// klik menu icon / ikon menu
        binding?.imageView?.setOnClickListener {
            val navDrawer = binding!!.drawerLayout
            if (!navDrawer.isDrawerOpen(GravityCompat.START)) navDrawer.openDrawer(GravityCompat.START) else navDrawer.closeDrawer(
                GravityCompat.END
            )
        }

        populateDrawerItem()

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

    /// fungsi untuk menampilkan drawer atau menu yang disamping pada halaman utama
    private fun populateDrawerItem() {
        // Klik navigasi pada drawer
        val navView = binding!!.navView
        navView.setNavigationItemSelectedListener { item: MenuItem ->
            when (item.itemId) {
                R.id.nav_profile -> {
                    startActivity(Intent(this, ProfileActivity::class.java))
                }
                R.id.nav_donate -> {
                    startActivity(Intent(this, DonateActivity::class.java))
                }
                R.id.nav_feedback -> {
                    startActivity(Intent(this, FeedbackActivity::class.java))
                }
                R.id.nav_contact -> {
                    startActivity(Intent(this, ContactActivity::class.java))
                }
            }
            true
        }
    }


    private fun populateHeader() {
        val hView = binding!!.navView.getHeaderView(0)
        val logo = hView.findViewById<ImageView>(R.id.logo)
        Glide.with(this)
            .load(R.drawable.logo)
            .into(logo)
    }


    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}