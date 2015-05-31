package com.github.kkkatsube.exresource

class TextEXResource(path:String) extends EXResource[String](path) {
  override def eval(file:String) : String = {
    file
  }
}
