package com.example.thethirdlineofcode

import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.title_wed_layou.*

class TitleWebFragment:Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.title_wed_layou,container,false)
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        webWebView.settings.setJavaScriptEnabled(true)
        webWebView.onResume()
      //  webWebView.loadUrl("file:///android_asset/index.html");

 //       webWebView.loadUrl("javascript:test('你的值')")


    }

    fun  receivetitleweb( title:String, web: String) {

          titleTextView.text=title
         webWebView.loadUrl(web)

    }


}