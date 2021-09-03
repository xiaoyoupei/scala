package com.znv.scala

object Demo10Function {
  def main (args: Array[String]): Unit = {
    /**
      * 面向对象编程：
      * 1、将对象作为参数
      * 2、将对象作为返回值
      *
      * 面向函数编程：(高阶函数)
      * 1、将函数作为参数
      * 函数的类型由函数参数的类型和返回值类型决定
      * def fun (str: String): String = str + "java"
      * 这就是一个参数为String返回值为String的函数
      *
      * 2、将函数作为返回值
      *
      */

    //    def fun (str: String): String = str + "后有scala"


    /**
      * 1、以函数作为参数
      */
    //    def fun1 (f: String => String) = {
    //      val str: String = f("先有java")
    //      println(str)
    //    }
    //
    //    /**
    //      * 只需要将函数的类型和要求的类型一致都可作为参数1传递
    //      */
    //    fun1(fun)
    //
    //
    //    /**
    //      * 高阶函数的应用
    //      */
    //    val lists: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8)
    //
    //    def fun2 (i: Int) = println(i)
    //
    //    lists.foreach(fun2)
    //    lists.foreach(println)


    /**
      * 2、以函数作为返回值
      */
    def fun1 (): String => Int = {

      //参数为String返回值为Int类型的函数
      def f (str: String): Int = {
        str.toInt
      }

      //以函数作为返回值
      f
    }

    val function: String => Int = fun1()
    println(function("100"))

    //链式调用
    println(fun1()("1001"))


    /**
      * 偏应用函数(偏函数)
      *
      * @param str
      * @return
      */
    def fun2 (s: String)(str: String): Int = (s + str).toInt

    println(fun2("10")("0"))


  }
}
