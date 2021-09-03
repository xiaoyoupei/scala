package com.znv.scala

import java.util

import scala.collection.mutable.ListBuffer

object Demo12List {
  def main (args: Array[String]): Unit = {
    /**
      * 集合分类
      * 1、List 不可变 有序 不唯一
      * 2、Set  可变 无序 唯一
      * 3、Map  key-value
      * 4、Tuple  元组
      */

    val lists: List[Int] = List(1, 2, 2, 3, 3, 4, 5, 6, 7, 8, 9, 234, 12412, 1412)

    /**
      * 集合中常用方法 不会改变原来集合 最多就是返回新的集合
      */
    println(lists.max)
    println(lists.min)
    println(lists.sum)
    println(lists.head) //取头
    println(lists.last) //取尾
    println(lists.tail) //不包含头元素的所有元素
    println(lists.take(2)) //获取前面n个元素
    println(lists.length)
    println(lists.size)
    println(lists.isEmpty)
    println(lists.nonEmpty)
    println(lists.reverse) //反转集合，返回新的集合
    println(lists.mkString("|")) //构建字符串,和split功能相反
    println(lists.contains(3))
    println(lists.distinct) //去重


    //创建list的另一方式
    //val bs: List[Int] = 1 :: 2 :: 3 :: Nil

    //val startTime: Long = System.currentTimeMillis

    //两种追加的方式
    //val ints: List[Int] = bs:+4:+5:+6
    //val reverse: List[Int] = (6::(5::(4 :: bs.reverse))).reverse
    //reverse.foreach(println)

    //val endTime: Long = System.currentTimeMillis
    //println(endTime - startTime)


    val list2 = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    /**
      * 每个元素加1
      */
    //1、原始版
    val arraylist = new util.ArrayList[Int]() //暂不考虑scala可变列表ListBuffer
    for (elem <- list2) {
      val i: Int = elem + 1
      arraylist.add(i)
    }
    println(arraylist)

    //2、优化版
    println(list2.map(_ + 1)) //map函数，将集合中的元素一个个传递给后面函数，返回一个新的集合


    /**
      * 取奇数
      */
    println(list2.filter(_ % 2 != 0)) //filter函数，将集合中的元素一个个传递给后面函数，入锅后面函数返回是true，保留这个元素


    val strs: List[String] = List("scala,spark,flink", "java,kafka,flink", "hadoop,spark,scala")

    /**
      * 将集合中每一行单词拆分
      */
    println(strs.flatMap(_.split(","))) //flatMap函数，将集合中的元素一个个传递给后面函数，进行拆分操作，最后返回一个新的集合


    /**
      * 排序
      * 1、sortBy：指定一个列来排序，默认是升序  返回新集合
      * 2、sortWith：指定排序的规则  返回新集合
      */
    val list3: List[Int] = 1 :: 2 :: 3 :: 4 :: 5 :: 6 :: 124 :: 12412 :: 124 :: 54 :: 35 :: Nil

    println(list3.sortBy((i: Int) => -i)) //负号降序

    println(list3.sortWith((i: Int, j: Int) => i < j))

    println(list3.sorted)

  }
}
