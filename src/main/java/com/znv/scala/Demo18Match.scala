package com.znv.scala

/**
  * java中匹配：基本数据类型、字符串、枚举
  * scala中匹配：基本数据数据类型、字符串、对象、类型
  *
  */
object Demo18Match {
  def main (args: Array[String]): Unit = {

    /**
      * 1、匹配字符串
      */
    val str: String = "hadoop"

    str match {
      case "scala" => println("这是scala")
      case "spark" => println("这是spark")
      case _ => println("其他")
    }


    /**
      * 2、匹配基本数据类型
      */
    val i: Int = 100

    i match {
      case 100 => println("100")
      case 200 => println("200")
      case _ => println("其他")
    }


    /**
      * 3、匹配对象
      */
    val user: User = User("1001", "xiao", 21)

    user match {
      case User("1001", "xiao", 21) => println("xiao")
      case User("1002", "you", 21) => println("you")
      case _ => println("其他")
    }


    /**
      * 4、匹配类型
      */
    val j: Any = 1
    j match {
      case j: Int => println("int类型")
      case j: String => println("String类型")
      case _ => println("其他")
    }


    /**
      * 模式匹配可以有返回值
      */

    val age: Int = 23
    val result: String = age >= 18 match {
      case true => "成年"
      case false => "未成年"
    }


    val map: Map[String, String] = Map("1001" -> "xiao", "1002" -> "you")
    println(map("1001"))
    println(map.getOrElse("1003", "默认值")) //getOrElse底层调用了match模式匹配


    /**
      * 解决空指针异常：get，存在key则返回some，不存在则返回none
      */
    val value: String = map.get("1003") match {
      case Some(v) => v
      case None => "默认值"
    }

  }
}

case class User (id: String, name: String, age: Int)
