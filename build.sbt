name := """ExResource"""

organization := "com.github.kkkatsube"

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))

javacOptions ++= Seq("-source", "1.6", "-target", "1.6")

scalaVersion := "2.11.4"

crossScalaVersions := Seq("2.10.4", "2.11.4")

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.1" % "test",
  "junit" % "junit" % "4.11" % "test",
  jdbc,
  anorm,
  cache,
  ws
)

bintraySettings

com.typesafe.sbt.SbtGit.versionWithGit


fork in run := true