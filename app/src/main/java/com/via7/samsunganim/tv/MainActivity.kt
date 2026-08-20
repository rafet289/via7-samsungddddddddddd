package com.via7.samsunganim.tv
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.via7.samsunganim.tv.databinding.ActivityMainTvBinding

class MainActivity: AppCompatActivity(){
    private lateinit var b: ActivityMainTvBinding
    override fun onCreate(s: Bundle?){super.onCreate(s); b=ActivityMainTvBinding.inflate(layoutInflater); setContentView(b.root)
        b.btnBrowser.setOnClickListener{ startActivity(Intent(this, BrowserActivity::class.java)) }
        b.btnYoutube.setOnClickListener{ val i=Intent(this, BrowserActivity::class.java); i.putExtra("url","https://www.youtube.com"); startActivity(i) }
        b.btnSettings.setOnClickListener{ finish() }
    }
}
