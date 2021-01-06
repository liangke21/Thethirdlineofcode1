package com.example.broadcastbestpractice

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity :AppCompatActivity() {
    lateinit var recreate: ForeceOffinReceiver
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityCollector.addActivity(this)
    }



    override fun onResume() {//和用户交互的时候调用
        super.onResume()
        val intentFilter = IntentFilter()
        intentFilter.addAction("com.example.broadcastbestpractice.FORce_OFFLINE")//监听广播
        recreate=ForeceOffinReceiver()
        registerReceiver(recreate,intentFilter)
    }

    override fun onPause() {//启动或则恢复的时候调用
        super.onPause()
        unregisterReceiver(recreate)
    }
    override fun onDestroy() {//注销的时候调用
        super.onDestroy()
        ActivityCollector.removActivity(this)
    }

    inner class ForeceOffinReceiver : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent?) {
            AlertDialog.Builder(context).apply { //对话框
                setTitle("提示")
                setMessage("确定要下线吗")
                setCancelable(false)
                setPositiveButton("ok"){
                    _,_->
                    ActivityCollector.finishAll()//销毁所有Activity
                    val i=Intent(context,LoginActivity640::class.java)
                    context.startActivity(i)//重新启动
                }
                setNegativeButton("取消"){
                    _,_,->
                }

                show()
            }
        }

    }
}