package com.znv.scala

import scala.io.Source

object Demo17WordCount {
  def main (args: Array[String]): Unit = {

    Source
      .fromFile("src/data/words.txt") //文件
      .getLines() //取每行
      .toList //转List
      .flatMap(_.split(",")) //按照,切分
      .groupBy(i => i) //分组
      .map(kv => (kv._1, kv._2.length)) //统计数量
      .foreach(println) //打印
  }
}
