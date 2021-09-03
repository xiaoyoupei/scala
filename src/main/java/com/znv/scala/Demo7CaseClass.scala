package com.znv.scala

object Demo7CaseClass {
  def main (args: Array[String]): Unit = {

    val sc: Score = Score("171842276", "1001", 99)

    //通过属性名获取属性值
    println(sc.sco)

    //修改属性的值，属性需要加var
    sc.sco=100

    println(sc)

  }
}

/**
  * 样例类
  * scala在编译的时候会自动给样例类增加toString方法，GetSet方法，序列化接口
  *
  * @param sid
  * @param cId
  * @param sco
  */
case class Score (sid: String, cId: String,var sco: Int)