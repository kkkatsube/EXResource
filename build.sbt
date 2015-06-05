name := """ExResource"""
organization := "com.github.kkkatsube"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))

javacOptions ++= Seq("-source", "1.6", "-target", "1.6")
scalaVersion := "2.11.4"
crossScalaVersions := Seq("2.9.1", "2.10.4", "2.11.4")

resolvers += "repo.codahale.com" at "http://repo.codahale.com"
libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.1" % "test",
  "junit" % "junit" % "4.11" % "test",
  "org.json4s" %% "json4s-native" % "3.2.11",
  "org.json4s" %% "json4s-jackson" % "3.2.11"
)
