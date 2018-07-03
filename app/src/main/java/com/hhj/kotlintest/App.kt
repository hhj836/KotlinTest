package com.hhj.kotlintest

import android.app.Application
import android.util.Log
import com.hhj.kotlintest.objectbox.bean.MyObjectBox
import io.objectbox.BoxStore
import io.objectbox.android.AndroidObjectBrowser

/**
 * Created by hhj on 2018/6/29.
 */
class App :Application() {

    //定义静态块 静态方法
    companion object {
        lateinit var boxStore: BoxStore
        fun getBoxStoreInstance() = boxStore
    }
    override fun onCreate() {
        super.onCreate()
        boxStore = MyObjectBox.builder().androidContext(this).name("test1").build()
        if (BuildConfig.DEBUG) {
            boxStore?.let {
                //可以理解为初始化连接浏览器(可以在浏览器中查看数据，下面再说)
                val started = AndroidObjectBrowser(boxStore).start(this)
                Log.i("ObjectBrowser", "Started: " + started)
            }
        }

    }


}