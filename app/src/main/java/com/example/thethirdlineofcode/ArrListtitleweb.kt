package com.example.thethirdlineofcode

import com.example.fragentbestpractice.MainActivity05

object ArrListtitleweb {

    val tableofContents=ArrayList<TitleWeb>().apply { //主目录

        add(TitleWeb("第一章 开始启程 你的第一行代码",""))
        add(TitleWeb("第二章 探究新语言 快速入门kotlin",""))
        add(TitleWeb("第三章 先从看的到入手 探究Activity",""))
        add(TitleWeb("第四章 软件也要拼脸蛋 UI开发的点点滴滴",""))
        add(TitleWeb("第五章 手机平板要兼容 探究Fragment",""))
        add(TitleWeb("第六章 全局大喇叭 详解广播机制",""))
        add(TitleWeb("第七章 数据储存全方案 详解持久化技术",""))
        add(TitleWeb("第八章 跨程序共享数据 探究ContentProvider",""))
        add(TitleWeb("第九章 丰富你的程序 运用手机多媒体 ",""))
        add(TitleWeb("第十章 后台默默的劳动者 探究Service",""))
        add(TitleWeb("第十一章",""))
        add(TitleWeb("第十二章",""))

    }


    val TitleList=ArrayList<TitleWeb>().apply {//第五章
        add(TitleWeb("Fragment的使用方式","file:///android_asset/index.html"))
        add(TitleWeb("Fragment生命周期",""))
        add(TitleWeb("动态加载布局",""))
        add(TitleWeb("Fragment最佳实践 一个建议版的新闻","file:///android_asset/index5.5.html"))
        add(TitleWeb("kotlin课堂扩展函数和运算符重载","file:///android_asset/index5.6.1.html"))
    }

  val ChapterSix=ArrayList<TitleWeb>().apply {

      add(TitleWeb("动态注册监听时间变化6.2.1","file:///android_asset/index6.2.1.html"))
      add(TitleWeb("静态注册实现开机启动6.2.2","file:///android_asset/index6.2.2.html"))
      add(TitleWeb("发送标准广播6.3.1","file:///android_asset/index6.3.1.html"))
      add(TitleWeb("发送有序广播6.3.2","file:///android_asset/index6.3.2.html"))
      add(TitleWeb("广播的最佳实践6.4.0","file:///android_asset/index6.4.0.html"))
      add(TitleWeb("Kotlin课堂:高阶函数","file:///android_asset/index6.5.0.html"))
      add(TitleWeb("Git时间:初始版本控制","file:///android_asset/index6.6.0.html"))

  }


}