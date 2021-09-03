package com.znv.scala

object Demo8Apply {
  def main (args: Array[String]): Unit = {
    Student1.print()

    //    Student1.apply("java")

    //apply 直接通过对象名调用
    //    Student1("scala")

    val stu1: Student1 = Student1("1001", "xiao")

  }
}

/**
  * Student1：相当于单例模式
  *
  * object中所有方法可以直接调用，相当于java中的给方法加static关键字
  */
//object Student1是class Student1的伴生对象
object Student1 {

  def print (): Unit = println("student")

  /**
    * apply函数 可以直接通过对象名调用
    */
  def apply (id: String, name: String): Student1 = new Student1(id, name)

}

class Student1 (id: String, name: String) {

}