package com.example.thethirdlineofcode


import android.os.Bundle
import android.view.LayoutInflater

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.thethirdlineofcode.ArrListtitleweb.TitleList

import kotlinx.android.synthetic.main.article_title_recyclerview.*


class TieleRecyclerViewFragment:Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.article_title_recyclerview,container,false)

    }





    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val layoutManager=LinearLayoutManager(activity)
        TitleRecyclerView.layoutManager=layoutManager
        val adapter=TitlerecyclerviewAdapter(TitleList)
        TitleRecyclerView.adapter=adapter


    }




    inner class TitlerecyclerviewAdapter(val TitleList:List<TitleWeb>): RecyclerView.Adapter<TitlerecyclerviewAdapter.ViewHolder>() {


        inner class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
            val newTitle: TextView = view.findViewById(R.id.newsTitle)

        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view=LayoutInflater.from(parent.context).inflate(R.layout.acrtcle_title,parent,false)
            val holder=ViewHolder(view)
            holder.itemView.setOnClickListener {
                val  newtitle=TitleList[holder.adapterPosition]
               chapterFiveActivity.actionStrt(parent.context,newtitle.title,newtitle.web)

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

