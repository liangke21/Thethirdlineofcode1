package com.example.thethirdlineofcode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.thethirdlineofcode.ArrListtitleweb.tableofContents
import kotlinx.android.synthetic.main.activity_main1.*


class MainActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)
        supportActionBar?.hide()






        val layoutManager= LinearLayoutManager(this)

        TitleRecyclerView2.layoutManager=layoutManager
        val adapter=TitlerecyclerviewAdapter(ArrListtitleweb.tableofContents)

        TitleRecyclerView2.adapter=adapter

    }



    inner class TitlerecyclerviewAdapter(val TitleList:List<TitleWeb>): RecyclerView.Adapter<TitlerecyclerviewAdapter.ViewHolder>() {


        inner class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
            val newTitle: TextView = view.findViewById(R.id.newsTitle1)

        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view= LayoutInflater.from(parent.context).inflate(R.layout.activity_main_title,parent,false)
            val holder=ViewHolder(view)
            holder.itemView.setOnClickListener {
                val  newtitle=tableofContents[holder.adapterPosition]
              when(newtitle.title){

                  "第五章 手机平板要兼容 探究Fragment"->chapterFiveActivityFragment.actionStrt(parent.context)
                      "第六章 全局大喇叭 详解广播机制"->ChapterSixActivityFragment.actionStrt(parent.context)

              }

            }
            return holder
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val news=    TitleList[position]
            holder.newTitle.text=news.title
        }

        override fun getItemCount()=TitleList.size


    }





}