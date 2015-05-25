name := """ExResource"""
organization := "com.github.kkkatsube"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))

javacOptions ++= Seq("-source", "1.6", "-target", "1.6")
scalaVersion := "2.11.4"
crossScalaVersions := Seq("2.10.4", "2.11.4")

// scalatest
libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.1" % "test",
  "junit" % "junit" % "4.11" % "test"
)
bintraySettings
com.typesafe.sbt.SbtGit.versionWithGit
fork in run := true

// scoverage
instrumentSettings
org.scoverage.coveralls.CoverallsPlugin.coverallsSettings
ScoverageKeys.highlighting := true
testOptions += Tests.Argument(TestFrameworks.ScalaTest, "-u", {val dir = System.getenv("CI_REPORTS"); if(dir == null) "target/reports" else dir} )

// specs2
//libraryDependencies ++= Seq(
//  "org.specs2" %% "specs2-core" % "3.6" % "test",
//  "org.specs2" %% "specs2-junit" % "2.4.15" % "test"
//)
//scalacOptions in Test ++= Seq("-Yrangepos")
