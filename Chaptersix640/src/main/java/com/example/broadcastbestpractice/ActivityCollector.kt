package com.example.broadcastbestpractice

import android.app.Activity

object ActivityCollector {
    private val activiies=ArrayList<Activity>()


    fun   addActivity(activity: Activity){//添加活动
        activiies.add(activity)

    }
    fun removActivity(activity: Activity){//减掉活动
        activiies.remove(activity)
    }
    fun finishAll() {
        for (activity in activiies) {
            if (!activity.isFinishing) {
                activity.finish()
            }

        }
        activiies.clear()
    }


}