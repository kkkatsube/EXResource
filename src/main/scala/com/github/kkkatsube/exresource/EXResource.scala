package com.github.kkkatsube.exresource

import scala.collection.mutable.HashMap
import scala.io.Source
import java.io.File

abstract class EXResource[T]( path: String ) extends HashMap[String,T] {
  protected def eval(file:String) : T
  
  def getPath = path
  
  override def get( key: String ) : Option[T] =
  {
    val file = new File( path + key )
    if( file.exists() && file.isFile() && file.canRead() )
    {
      val s = Source.fromFile( path + key );
      super.put( key, eval( s.mkString ) )
      super.get( key )
    }
    else
    {
      None
    }
  }
}
