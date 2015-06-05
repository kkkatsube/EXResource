package com.github.kkkatsube.exresource

import org.json4s._
import org.json4s.native.JsonMethods._

class JSONEXResource(path:String) extends EXResource[JValue](path) {
  override def eval(file:String) : JValue = {
    parse( file )
  }
}
