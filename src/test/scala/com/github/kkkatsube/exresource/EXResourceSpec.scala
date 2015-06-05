package com.github.kkkatsube.exresource

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{WordSpec, FlatSpec, MustMatchers}
import java.io.File
import org.json4s._
import org.json4s.native.JsonMethods._

@RunWith( classOf[JUnitRunner] )
class EXResourceSpec extends WordSpec with MustMatchers {
  val path = new File("").getAbsolutePath + "/src/test/resources/"
  
  "Basic case Test" must {
    val exr = new TextEXResource( path )
    
    "path validation" in {
      exr.getPath must equal (path)
    }
    
    "non exists validation" in {
      exr.get("NON-EXISTS-RESOURCE-FILE") must equal (None)
    }
  }
  
  "Text EXResource Test" must{
    val exr = new TextEXResource( path )

    "resource TextEXResource.scala.text-resource text validation" in {
      exr.get("TextEXResourceSpec.scala.text-resource").get must equal ("This is test.")
    }
  }

  "JSON EXResource Test" must{
    val exr = new JSONEXResource( path )

    "resource JSONEXResource.scala.json-resource JSON validation" in {
      exr.get("JSONEXResourceSpec.scala.json-resource").get must equal (parse("""{ "numbers" : [1, 2, 3, 4] }"""))
    }
  }
  
}
