package com.hhj.kotlintest

import android.util.Log
import android.widget.TextView
import butterknife.BindView
import butterknife.ButterKnife
import com.hhj.appbase.base.BaseViewActivity
import com.hhj.appbase.base.RequiresPresenter
import com.hhj.kotlintest.objectbox.bean.Conversation
import com.hhj.kotlintest.objectbox.bean.Conversation_
import com.hhj.kotlintest.objectbox.bean.MsgBean
import com.hhj.kotlintest.presenter.MainPresenter
import io.objectbox.Box
import io.objectbox.query.Query
import okhttp3.*
import java.util.*

/**
 * Created by hhj on 2018/6/1.
 */
@RequiresPresenter(MainPresenter::class)
class TestActivity : BaseViewActivity<MainPresenter>() {
    val JSON = MediaType.parse("application/json; charset=utf-8")

    override fun onPreInitView() {
        ButterKnife.bind(this)
    }
    @BindView(R.id.test1)
    lateinit var test1 : TextView

    override fun getLayoutId()=R.layout.ac_test

    override fun initView() {
        test1.text="我是1"
   /*     var  client =OkHttpClient();

        var  body = RequestBody.create(JSON, "");

        var  request = Request.Builder()
                .url("")
                .post(body)
                .build();

        var response  = client.newCall(request).execute();*/
  /*  var cons:ArrayList<Conversation> = arrayListOf()
        for(i in 1..10){
            var con=Conversation()
            con.name=i.toString()
            var  msg=MsgBean()
            msg.msg="msg--"+i
            msg.time=System.currentTimeMillis().toString()
            con.msg.target=msg
            cons.add(con)
        }
        var boxStore = App.getBoxStoreInstance()
        var myBox: Box<Conversation> = boxStore.boxFor(Conversation::class.java)
        myBox.put(cons)
        var conImp= myBox.find(Conversation_.name,"5")[0];
        Log.d("TestActivity",""+conImp.msg?.target.msg)*/
        var boxStore = App.getBoxStoreInstance()
        var myBox: Box<Conversation> = boxStore.boxFor(Conversation::class.java)
        var query:Query<Conversation> = myBox.query().orderDesc(Conversation_.id).build()
        var consNew=query.find(0,5);
        Collections.sort(consNew)
        for(item in consNew){
            Log.d("TestActivity",""+item.msg?.target.msg)
        }

    }
}