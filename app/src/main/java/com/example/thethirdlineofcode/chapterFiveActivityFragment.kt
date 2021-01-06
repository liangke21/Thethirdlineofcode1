package com.example.thethirdlineofcode

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class chapterFiveActivityFragment : AppCompatActivity() {

    companion object{

        fun   actionStrt(context: Context){
            val intent= Intent(context,chapterFiveActivityFragment::class.java)
            context.startActivity(intent)
        }


    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter_five_fragment)
    }
}