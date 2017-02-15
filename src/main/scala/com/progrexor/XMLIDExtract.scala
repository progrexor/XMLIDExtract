package com.progrexor

import scala.xml.XML

/**
  * Created by andreyd on 15/02/2017.
  */
object XMLIDExtract {
  def main(args: Array[String]): Unit = {
    val xml = XML.loadFile(args(0))
    print(xml \\ "id" text)
  }
}