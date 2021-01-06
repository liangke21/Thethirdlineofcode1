package com.example.fragentbestpractice

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.diyihang505.R
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main05.*
import kotlinx.android.synthetic.main.news_title_frag.*

class NewsTitleFrgment:Fragment() {
    private var  isTwoPane=false
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.news_title_frag,container,false)
    }//第三部动态布局加载进来

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        isTwoPane=activity?.findViewById<View>(R.id.newsContentLyout)!=null
        Log.d("是真是假","$isTwoPane")

        //true
                  //当前活动能不能在当前视图中拿到这个id     拿到为  true 拿不到false
     ///////////////////////////////////////////////////////

        val layoutManager=LinearLayoutManager(activity)
        newsTitleRecyclerView.layoutManager=layoutManager
        val adapter=NewsAdapter(getNew())
        newsTitleRecyclerView.adapter=adapter

    }

    private fun getNew():List<News>{
        val newsList=ArrayList<News>()
        for (i in 1..50){
            val news=News("新闻标题$i",getRandomLengthSting("我是新闻类容"))
            newsList.add(news)
        }
        return newsList
    }

    private fun getRandomLengthSting(str:String):String{
        val n=(1..100).random()//随机数
        val builder=StringBuffer()
        repeat(n){
            builder.append(str)
        }
        return builder.toString()
    }



    inner class NewsAdapter(val newsList: List<News>):RecyclerView.Adapter<NewsAdapter.ViewHolder>(){


        inner class   ViewHolder(view:View):RecyclerView.ViewHolder(view){
            val newTitle : TextView =view.findViewById(R.id.newsTitle)//新闻标题

        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view=LayoutInflater.from(parent.context).inflate(R.layout.news_item,parent,false)//动态加载新闻布局
            val holder=ViewHolder(view)
            holder.itemView.setOnClickListener{//当前视图子项目按钮
                val news=newsList[holder.adapterPosition]//那个子项目


                if(isTwoPane){//判断为空吗
                    val fragment=newsContentFrag as NewsContentFragment
                    fragment.refresh(news.title,news.content)                //大屏幕
                }else{
                    Log.d("ddd","daaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa")
                    NewsContentActivity.actionStar(parent.context,news.title,news.content)//这里是小屏幕

                }
            }

            return holder
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val news=newsList[position]
            holder.newTitle.text=news.title
        }

        override fun getItemCount()=newsList.size

    }
}