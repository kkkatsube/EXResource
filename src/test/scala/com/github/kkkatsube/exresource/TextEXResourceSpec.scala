package com.github.kkkatsube.exresource

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{WordSpec, FlatSpec, MustMatchers}
import java.io.File

@RunWith( classOf[JUnitRunner] )
class TextEXResourceSpec extends WordSpec with MustMatchers {
  val path = new File("").getAbsolutePath + "/src/test/resources/"
  val exr = new TextEXResource( path )
  
  "Basic case Test" must {
    "path validation" in {
      exr.getPath must equal (path)
    }
    "resource TextEXResource.scala.text-resource text validation" in {
      exr.get("TextEXResourceSpec.scala.text-resource").get must equal ("This is test.")
    }
//    "non exists validation" in {
//      exr.get("NON-EXISTS-RESOURCE-FILE") must equal (None)
//    }
  }
}
