package com.znv.scala

import scala.collection.mutable.ListBuffer

object Demo13ListBuffer {
  def main (args: Array[String]): Unit = {
    /**
      * 可变集合
      *
      * scala.collection.mutable 可变集合
      * scala.collection.immutable 不可变集合
      *
      */
    val listbuffer: ListBuffer[Int] = ListBuffer[Int]()

    listbuffer.+=(11) //增加元素
    listbuffer += 22 //简写增加元素
    listbuffer.remove(1) //指定下标删除元素
    listbuffer.insert(1, 33) //指定下标插入元素
    listbuffer ++= List(1, 2, 3, 4, 5, 6, 7, 8, 9) //末尾并上集合
    val list: List[Int] = listbuffer.toList

    println(listbuffer)
    println(list)




  }
}
