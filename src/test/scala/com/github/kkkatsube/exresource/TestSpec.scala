package com.github.kkkatsube.exresource

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{WordSpec, MustMatchers}

@RunWith( classOf[JUnitRunner] )
class TestSpec extends WordSpec with MustMatchers {

  object Test extends Test

  "Test" must {
    "say hello true" in {
      Test.helloWorld( true ) must equal ("Hello World!")
    }
  }

}