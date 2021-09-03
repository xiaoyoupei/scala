package com.znv.scala

object Demo9Function {
  def main (args: Array[String]): Unit = {

  }

  /**
    * def 函数关键字
    * fun1 函数名称
    * Unit 相当于void
    * {} 函数体
    */
  def fun1 (): String = {
    println("fun1")
    "scala"
  }

  /**
    * 调用函数
    * 1、类中函数，必须使用类的对象调用
    * 2、object中的函数，可以直接调用
    * 3、函数中定义的函数可以直接调用
    */
  fun1()


  /**
    * 函数的简写
    * 1、函数没有参数，括号可以不写
    * 2、函数的返回值类型可以不写，scala会自动推断返回值的类型，不过一般都会写，提高辨识度
    * 3、如果最后一行作为返回值，return可以不写
    * 4、如果函数只有一行的代码，{}可以不写
    */
  def fun2 = "scala"

}
