package com.hhj.kotlintest.objectbox.bean

import io.objectbox.annotation.Entity
import io.objectbox.annotation.Id
import io.objectbox.relation.ToOne


/**
 * Created by hhj on 2018/6/29.
 */
@Entity
class Conversation :Comparable<Conversation>{
    override fun compareTo(other: Conversation)=when{
        other.id>this.id -> -1
        other.id<this.id -> 1
        else -> 0
    }

    @Id
    var id: Long = 0

    var name: String? = null

    lateinit var msg: ToOne<MsgBean>

    fun getMsgCnt()=0;
}