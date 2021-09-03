package com.znv.scala

import scala.collection.mutable
import scala.collection.mutable.HashSet

/**
  * Set集合 无序，唯一，默认不可变
  */
object Demo14Set {
  def main (args: Array[String]): Unit = {
    val sets: Set[Int] = Set(1, 2, 3, 4, 5, 6, 4, 4, 7, 9)

    println(sets) //自动去重 自带hash

    val set1: Set[Int] = Set(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val set2: Set[Int] = Set(1, 2, 3, 4, 5, 10)

    println(set1 & set2) //交集
    println(set1 | set2) //并集
    println(set1 &~ set2) //差集
    println("=" * 100)

    val set3: Set[Int] = Set(1, 2, 3, 4, 5, 6, 7, 8, 9)
    println(set3.filter(_ % 2 == 1))
    println(set3.map(_ * 2))
    println(set3.head)
    println(set3.last)

    val hashSet: mutable.HashSet[String] = HashSet[String]()

    hashSet.add("scala") //增加元素
    hashSet += "flink"
    println(hashSet)

    hashSet.remove("scala")
    hashSet -= "flink"

    println(hashSet)


  }
}
