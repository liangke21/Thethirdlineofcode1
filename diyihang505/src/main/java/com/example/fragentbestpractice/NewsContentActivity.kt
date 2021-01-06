package com.example.fragentbestpractice

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.diyihang505.R
import kotlinx.android.synthetic.main.activity_main05.*
import kotlinx.android.synthetic.main.activity_news_content.*
import kotlinx.android.synthetic.main.news_content_frag.*

class NewsContentActivity : AppCompatActivity() {

    companion object {
        fun actionStar(context: Context, title: String, content: String) {
                                         //
            val intent = Intent(context, NewsContentActivity::class.java).apply {
                putExtra("news_title", title)
                putExtra("news_content", content)
            }
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
                               //新闻类容布局
        setContentView(R.layout.activity_news_content)//加载布局
        val title = intent.getStringExtra("news_title")//获取传入的新闻标题
        val content = intent.getStringExtra("news_content")//获取传入的新闻类容
        if (title != null && content != null) {
                                           //fragmen里面的新闻类容
            val fragment = newsTitleFrag1 as NewsContentFragment
            fragment.refresh(title, content)
        }

    }
}