package com.example.appwebview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_web_view2.*

class WebView2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view2)

        btnVoltar.setOnClickListener { v : View? ->

            var intent = Intent (this, MainActivity::class.java)

            startActivity(intent);
        }

        webView.webViewClient = WebViewClient()
        webView.settings.javaScriptEnabled = true
        webView.settings.builtInZoomControls = true

        webView.loadUrl("https://www.ebay.com/")
    }
}