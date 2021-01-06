package com.example.broadcastbestpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chaptersix640.R

import kotlinx.android.synthetic.main.activity_main640.*

class MainActivity640 : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main640)
       xiaxian.setOnClickListener {
           val intent= Intent("com.example.broadcastbestpractice.FORce_OFFLINE")
           sendBroadcast(intent)
       }
    }
}