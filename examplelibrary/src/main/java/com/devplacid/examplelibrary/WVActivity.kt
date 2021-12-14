package com.devplacid.examplelibrary

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class WVActivity : AppCompatActivity() {

    private val URL = "https://en.wikipedia.org/wiki/Main_Page"
    private lateinit var wvwv: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wvactivity)

        wvwv = findViewById(R.id.wvwv)
        wvwv.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                if (url != URL) {
                    Toast.makeText(
                        this@WVActivity,
                        "Going to new URL",
                        Toast.LENGTH_SHORT
                    )
                        .show()
                }
                return super.shouldOverrideUrlLoading(view, url)
            }
        }
        wvwv.loadUrl(URL)
    }

}