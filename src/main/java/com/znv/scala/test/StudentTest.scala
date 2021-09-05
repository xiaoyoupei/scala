package com.znv.scala.test

import scala.io.Source

object StudentTest01 {
  def main (args: Array[String]): Unit = {
    /**
      * 1、统计班级的人数
      */

    //读取文件的数据
    Source
      .fromFile("src/data/students.txt")
      .getLines()
      .toList //转为list置于内存(数据量小)
      .map(_.split(",")(4))
      .groupBy(i => i) //按照班级分组
      .map(i => (i._1, i._2.length))
      .foreach(println)

    /**
      * 2、统计学生的总分
      */

    Source
      .fromFile("src/data/score.txt")
      .getLines()
      .toList
      .map(i => {
        val strings: Array[String] = i.split(",")
        Score(strings(0), strings(1), strings(2).toInt)
      }) //将每一行数据转换为Score对象
      .groupBy(i => i.sId) //按照学号分组
      .map(i => {
      (i._1, i._2.map(_.sco).sum)
    })
      .foreach(println)


  }

}

case class Score (sId: String, cId: String, sco: Int)
