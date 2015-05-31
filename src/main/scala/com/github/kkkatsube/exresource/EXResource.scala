package com.github.kkkatsube.exresource

import scala.collection.mutable.HashMap
import scala.io.Source

abstract class EXResource[T]( path: String ) extends HashMap[String,T] {
  val cache : Map[String,T] = Map[String,T]()

  protected def eval(file:String) : T
  
  override def get( key: String ) : Option[T] =
  {
    val s = Source.fromFile( path + key );
    super.put( key, eval( s.mkString ) )
    super.get( key )
  }
}
