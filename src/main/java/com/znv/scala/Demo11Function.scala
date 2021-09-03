package com.znv.scala

object Demo11Function {
  def main (args: Array[String]): Unit = {

    /**
      * 匿名函数
      */

    def fun1 (f: String => Int) = {
      val i: Int = f("100")
      println(i)
    }

    //下面书写过于繁琐
    //    def fun2(s:String):Int={
    //      s.toInt
    //    }

    //    fun1(fun2)

    //匿名函数
    fun1((str: String) => str.toInt)

    //优化
    fun1(str => str.toInt)

    //再优化：如果参数只用一次可以使用下划线代替
    fun1(_.toInt)

    val lists: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
    lists.foreach((i: Int) => println(i))
    lists.foreach(i => println(i))
    lists.foreach(println)

  }
}
