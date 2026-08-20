package com.via7.samsunganim.tv
import android.os.Bundle
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.via7.samsunganim.tv.databinding.ActivityBrowserTvBinding

class BrowserActivity: AppCompatActivity(){
    private lateinit var b: ActivityBrowserTvBinding
    override fun onCreate(s: Bundle?){
        super.onCreate(s); b=ActivityBrowserTvBinding.inflate(layoutInflater); setContentView(b.root)
        val url = intent.getStringExtra("url") ?: "https://www.google.com"
        b.webView.webViewClient = WebViewClient()
        b.webView.settings.javaScriptEnabled = true
        b.webView.settings.domStorageEnabled = true
        b.webView.loadUrl(url)
        b.btnBack.setOnClickListener{ if(b.webView.canGoBack()) b.webView.goBack() else finish() }
        b.btnClose.setOnClickListener{ finish() }
    }
}
