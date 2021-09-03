package com.znv.scala

import java.util.logging.Logger

import sun.util.logging.resources.logging


object Demo6Class {
  def main (args: Array[String]): Unit = {

    val stu: Student = new Student("1001", "xiao", 23,"123456")

    println(stu)

  }
}

class Person (mdn: String) {
  val global: Logger = Logger.getGlobal
  global.info("父类默认构造函数执行")
  val _mdn: String = mdn

  override def toString = s"Person(${_mdn})"
}

/**
  * 继承了父类Person，默认直接调用父类的构造函数
  *
  * @param id
  * @param name
  * @param mdn
  */
//默认构造函数
class Student (id: String, name: String, mdn: String) extends Person(mdn) {


  global.info("子类默认构造函数执行")

  val _id: String = id
  val _name: String = name

  var _age: Int = _ //占位符_,只定义不赋值

  //重载构造函数
  def this (id: String, name: String, age: Int, mdn: String) {
    this(id, name, mdn) //再重载构造函数的第一行需要先调用默认的构造函数

    global.info("子类重载构造函数执行")

    this._age = age //成员变量赋值
  }

  override def toString: String = s"student(${_id}\t${_name}\t${_age}\t$mdn)"
}