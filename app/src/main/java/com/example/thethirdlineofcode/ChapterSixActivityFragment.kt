package com.example.thethirdlineofcode

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ChapterSixActivityFragment : AppCompatActivity() {
        companion object{

            fun   actionStrt(context: Context){
                val intent= Intent(context,ChapterSixActivityFragment::class.java)
                context.startActivity(intent)
            }


        }



        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_chapter_six_fragment)
        }
    }