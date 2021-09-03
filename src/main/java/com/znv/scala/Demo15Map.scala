package com.znv.scala

/**
  * Map key value格式，默认不可变
  */
object Demo15Map {
  def main (args: Array[String]): Unit = {
    // ->返回二元组Tuple2[A, B]
    val map: Map[String, String] = Map(("1001", "scala"), "1002" -> "flink", "1003" → "kafka")

    println(map("1001"))
    println(map.get("1004"))
    println(map.getOrElse("1004", "java")) //getOrElse可以设置查找不到返回默认值

    //map集合遍历的时候并不是两个参数而是二元组
    map.foreach(kv => println(kv._1 + "\t" + kv._2))


  }
}