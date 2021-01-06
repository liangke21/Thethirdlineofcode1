package com.example.broadcasttest

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.chaptersix621.R

class MainActivity621 : AppCompatActivity() {
    lateinit var timeChangReceiver:TimeChangeReceiver//定义
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main621)
        val intFilter= IntentFilter()
        intFilter.addAction("android.intent.action.TIME_TICK")//实现了监听系统的时间
        timeChangReceiver=TimeChangeReceiver()//实例化
        registerReceiver(timeChangReceiver,intFilter)
        //需要等一分钟才广播
    }

    inner class TimeChangeReceiver:BroadcastReceiver(){

        override fun onReceive(context: Context?, intent: Intent?) {
            Toast.makeText(context,"你好呀",Toast.LENGTH_SHORT).show()
        }
    }

}