package com.example.broadcastbestpractice

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.example.chaptersix640.R
import kotlinx.android.synthetic.main.activity_login640.*

class LoginActivity640 :BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login640)
        denglu.setOnClickListener {
            val zhanghu=zhanghuEDIT.text.toString()
            val mima=mimaEDIT.text.toString()
            if (zhanghu=="admin"&& mima=="123456"){
                val intent=Intent(this,MainActivity640::class.java)
                startActivity(intent)
                finish()//注销当前活动
            }else{
                Toast.makeText(this,"账户或则密码输入错误",Toast.LENGTH_SHORT).show()

            }
        }
    }
}