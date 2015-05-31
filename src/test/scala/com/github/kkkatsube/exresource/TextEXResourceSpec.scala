package com.github.kkkatsube.exresource

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{WordSpec, MustMatchers}

@RunWith( classOf[JUnitRunner] )
class TextEXResourceSpec extends WordSpec with MustMatchers {
  "Test" must {
    "TextEXResource.scala.text-resource" in {
      val exr = new TextEXResource("/Users/kimihiko/Documents/workspaces/EXResource/src/test/resources/")
      exr.get("TextEXResourceSpec.scala.text-resource").get must equal ("This is test.")
    }
  }

}