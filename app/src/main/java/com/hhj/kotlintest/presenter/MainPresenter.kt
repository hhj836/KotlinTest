package com.hhj.kotlintest.presenter

import android.os.Bundle
import com.hhj.appbase.base.BasePresenter
import com.hhj.kotlintest.MainActivity
import com.hhj.kotlintest.TestActivity

/**
 * Created by hhj on 2018/6/1.
 */
class MainPresenter : BasePresenter<TestActivity>() {
    override fun onCreate(view: TestActivity, savedState: Bundle?) {
        super.onCreate(view, savedState)
    }

    override fun onCreateView(view: TestActivity) {
        super.onCreateView(view)
    }
}