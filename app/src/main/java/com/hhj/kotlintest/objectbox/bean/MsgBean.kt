package com.hhj.kotlintest.objectbox.bean

import io.objectbox.annotation.Entity
import io.objectbox.annotation.Id



/**
 * Created by hhj on 2018/6/29.
 */
@Entity
class MsgBean {
    @Id
    var id: Long = 0
    var  msg:String?=null
    var  time:String?=null
}