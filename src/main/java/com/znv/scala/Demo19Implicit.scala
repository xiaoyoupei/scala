package com.znv.scala

import java.io.File

import scala.io.Source


/**
  * 隐式转换
  */
object Demo19Implicit {
  def main (args: Array[String]): Unit = {
    /**
      * 编译时的解析：
      * 1、隐式转换方法
      * 2、隐式转换变量
      * 3、隐式转换类
      */

    /**
      * 1、隐式转换方法
      * 隐式转换方法和方法名无关，和参数类型、返回类型有关
      *
      */
    //    implicit def stringToInt (str: String): Int = {
    //      println("stringToInt隐式转换方法被调用")
    //      Integer.parseInt(str)
    //    }
    //
    //    implicit def doubleToInt (dou: Double): Int = {
    //      println("doubleToInt隐式转换方法被调用")
    //      //Integer.parseInt(dou.toString) 错误
    //      dou.toInt
    //    }
    //
    //    def print (j: Int) = {
    //      println(j)
    //    }
    //
    //    print("1")
    //    print(1.1)


    /**
      * 2、隐式转换变量
      */
    //    def fun (str1: String)(implicit str2: String) = {
    //      println(str1 + "\t" + str2)
    //    }
    //
    //    implicit val str2: String = "spark" //隐式转换变量 类似于默认参数
    //
    //    fun("scala")("flink")
    //    fun("scala") //调用方法的时候自动使用隐式转换的变量，同一作用域中只能有一个类型一样的隐式转换变量


    /**
      * 3、隐式转换类
      * 可以将构造函数参数的类型转换成当前类型
      */
    //Source.fromFile(new File("src/data/score.txt")).getLines().toList

    val list: List[String] = "src/data/score.txt".read() //隐式转换将String类型转化为Read类型，Read类型里面含有read方法

  }

  implicit class Read (path: String) {
    def read () = {
      Source.fromFile(path).getLines().toList
    }
  }

}


