package com.znv.scala

/**
  * 元组 最多支持22个元素
  */
object Demo16Tuple {
  def main (args: Array[String]): Unit = {
    val t = (1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(t._10) //直接通过下划线获取数据

  }
}
