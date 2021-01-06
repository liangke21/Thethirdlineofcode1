package com.example.broadcasttest
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chaptersix631.R
import kotlinx.android.synthetic.main.activity_main631.*
class MainActivity631 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main631)
      button.setOnClickListener {
        val intent= Intent("android.intent.broadcasttest.MY_BROADCAST")//实现了监听系统的时间
          intent.setPackage(packageName)
          sendBroadcast(intent)
    }
    }


}