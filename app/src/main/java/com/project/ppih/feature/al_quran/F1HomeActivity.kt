package com.project.ppih.feature.al_quran

import android.annotation.SuppressLint
import android.app.ProgressDialog
import android.os.Build
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.project.ppih.databinding.ActivityF1HomeBinding


class F1HomeActivity : AppCompatActivity() {

    private var binding: ActivityF1HomeBinding ? = null

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityF1HomeBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        val webSettings = binding!!.webView.settings
        webSettings.javaScriptEnabled = true
        webSettings.allowContentAccess = true
        webSettings.domStorageEnabled = true
        webSettings.loadsImagesAutomatically = true


        when {
            Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP -> {
                webSettings.mixedContentMode = 0
                binding!!.webView.setLayerType(View.LAYER_TYPE_HARDWARE, null)
            }
            Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT -> {
                binding!!.webView.setLayerType(View.LAYER_TYPE_HARDWARE, null)
            }
            else -> {
                binding!!.webView.setLayerType(View.LAYER_TYPE_SOFTWARE, null)
            }
        }

        val progressDialog = ProgressDialog(this)
        progressDialog.setMessage("Silahkan tunggu...")
        progressDialog.setCancelable(false)
        progressDialog.show()

        binding!!.webView.webViewClient = Callback()
        binding!!.webView.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                view.loadUrl(url)
                return true
            }

            override fun onPageFinished(view: WebView, url: String) {
                if (progressDialog.isShowing) {
                    progressDialog.dismiss()
                }
            }

            override fun onReceivedError(
                view: WebView,
                errorCode: Int,
                description: String,
                failingUrl: String
            ) {
                Toast.makeText(this@F1HomeActivity, "Error:$description", Toast.LENGTH_SHORT)
                    .show()
            }
        }
        binding!!.webView.loadUrl("https://quran.kemenag.go.id")

    }

    private class Callback : WebViewClient() {
        //HERE IS THE MAIN CHANGE.
        override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
            return false
        }
    }


    override fun onBackPressed() {
        if (binding!!.webView.canGoBack()) {
            binding!!.webView.goBack()
        } else {
            super.onBackPressed()
        }
    }


    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}