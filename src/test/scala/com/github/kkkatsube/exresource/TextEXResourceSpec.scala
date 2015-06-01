package com.github.kkkatsube.exresource

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{WordSpec, MustMatchers}
import java.io.File

@RunWith( classOf[JUnitRunner] )
class TextEXResourceSpec extends WordSpec with MustMatchers {
  "Basic case Test" must {
    "path validation" in {
      val path = new File("").getAbsolutePath + "/src/test/resources/"
      val exr = new TextEXResource( path )
      exr.getPath must equal (path)
    }
    "TextEXResource.scala.text-resource" in {
      val path = new File("").getAbsolutePath + "/src/test/resources/"
      val exr = new TextEXResource( path )
      exr.get("TextEXResourceSpec.scala.text-resource").get must equal ("This is test.")
    }
  }
}
