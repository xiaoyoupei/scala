package com.znv.scala

import java.io.{BufferedReader, FileReader}

import scala.io.{BufferedSource, Source}

object Demo3Base {
  def main(args: Array[String]): Unit = {


    /**
      * 变量
      * 自动推断变量的类型
      *
      * var 变量
      * val 常量
      *
      * 尽量使用val
      */

    //    var j = 10
    //    var i: Int = 10
    //
    //    //可修改变量的值
    //    i = 100
    //    println(100)
    //
    //    val a = 100 //常量，类似于java final


    /**
      * 类型转换
      */

    //    val s = "100"
    //    println(Integer.parseInt(s)) //java中的类型转换
    //
    //    s.toInt //底层还是调用的java的Integer.parseInt(toString)
    //    s.toLong
    //    //val i: Int = "a".toInt //类型转换不匹配会报异常

    /**
      * 文件的读写
      */

    //java的方式
    //    val filereader: FileReader = new FileReader("src/data/students.txt")
    //
    //    val bufferedReader = new BufferedReader(filereader)
    //
    //    var line: String = bufferedReader.readLine()
    //
    //    while (line != null) {
    //      println(line)
    //
    //      line = bufferedReader.readLine();
    //    }

    //scala的方式
    //    val file: BufferedSource = Source.fromFile("src/data/students.txt")
    //
    //    val lines: Iterator[String] = file.getLines()//读取所有行
    //
    //    for (elem <- lines) {//遍历迭代器
    //      println(elem)
    //    }

    /**
      * 列表
      */

    //    val list: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8) //不可变的
    //    for (elem <- list) { //增强for循环遍历
    //      println(elem)
    //    }
    //
    //    var i = 0
    //    while (i < list.length) { //下表循环遍历
    //      println(list(i))
    //      i += 1
    //    }
    //
    //    list.foreach(println) //面向函数的方式


    /**
      * 字符串拼接
      *
      */

    //java
    var strings = "java" + "scala" + "flink"
    val stringBuilder = new StringBuilder
    stringBuilder.append("java")
    stringBuilder.append("scala")
    stringBuilder.append("flink")

    //scala
    var j = "java" //作为参数传入
    var str = s"$j\tscala\tflink" //s是定义的方法,底层还是StringBuilder
    println(str)

  }
}
