package com.example.thethirdlineofcode

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.broadcastbestpractice.LoginActivity640
import com.example.broadcastbestpractice.MainActivity640
import com.example.broadcasttest.MainActivity621
import com.example.broadcasttest.MainActivity631
import com.example.broadcasttest.MainActivity632
import com.example.fragentbestpractice.MainActivity05
import kotlinx.android.synthetic.main.activity_chapter_five.*
import kotlinx.android.synthetic.main.yunxing.*

class chapterFiveActivity : AppCompatActivity() {


 companion object{

          fun actionStrt(contxt:Context,title:String,web:String,){

              val intent= Intent(contxt,chapterFiveActivity::class.java).apply {
                  putExtra("intent_title",title)
                  putExtra("intent_web",web)



              }
              contxt.startActivity(intent)

          }

 }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter_five)
       yunxinbutton.setOnClickListener {
           val title=intent.getStringExtra("intent_title")
           when(title){//项目运行

      "Fragment最佳实践 一个建议版的新闻"->intent=Intent(this,MainActivity05::class.java)
              "动态注册监听时间变化6.2.1"->intent=Intent(this,MainActivity621::class.java)
                     "发送标准广播6.3.1"->intent= Intent(this,MainActivity631::class.java)
                     "发送有序广播6.3.2"->intent=Intent(this,MainActivity632::class.java)
               "广播的最佳实践6.4.0"->intent=Intent(this, LoginActivity640::class.java)
           }

           startActivity(intent)



       }
        val title=intent.getStringExtra("intent_title")
        val web=intent.getStringExtra("intent_web")
        if (title!=null&&web!=null){
            val  fragment=titlewebfragment as TitleWebFragment
            fragment.receivetitleweb(title,web)
            supportActionBar?.hide()
        }


    }
}