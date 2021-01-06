package com.example.broadcasttest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.chaptersix632.R

import kotlinx.android.synthetic.main.activity_main632.*

class MainActivity632 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main632)
           button.setOnClickListener {
               val intent= Intent("com.example.broadcasttest.MY_BROADCAST")//发送一条广播
               intent.setPackage(packageName)//获取程序包名
              sendOrderedBroadcast(intent,null)//第二个参数是权限相关的字符

           }
    }
}