package com.znv.scala

//默认构造函数
class Demo5ScalaStudent(id: String, name: String, age: Int) {

  //定义成员变量，定义可以直接赋值
  var _id: String = id //直接var id = id 是错误的
  var _name: String = name
  var _age: Int = age

  println("scala默认构造函数")


  //重写父类的方法 注意带下划线的参数传入字符串时需要加{}
  override def toString: String = s"${_id}\t${_name}\t${_age}"
}
