package com.znv.scala

import java.util

object Demo2java {
  def main(args: Array[String]): Unit = {

    /**
      * 类型自动推断，根据等号右边自动推断
      */
    val arr = new util.ArrayList[String]()

    arr.add("java")
    arr.add("scala")
    println(arr)
  }
}
