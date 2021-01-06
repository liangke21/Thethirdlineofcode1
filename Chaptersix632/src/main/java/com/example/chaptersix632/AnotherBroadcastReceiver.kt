package com.example.broadcasttest

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AnotherBroadcastReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.

        Toast.makeText(context,"我执行了AnotherBroadcastReceiver", Toast.LENGTH_SHORT).show()
        abortBroadcast()//执行到这里后面的广播都不执行了//载段
    }
}