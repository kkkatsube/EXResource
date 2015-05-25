resolvers += Resolver.url(
  "bintray-sbt-plugin-releases",
  url("http://dl.bintray.com/content/sbt/sbt-plugin-releases"))(
    Resolver.ivyStylePatterns)
addSbtPlugin("me.lessis" % "bintray-sbt" % "0.1.2")

resolvers += "jgit-repo" at "http://download.eclipse.org/jgit/maven"
addSbtPlugin("com.typesafe.sbt" % "sbt-git" % "0.6.4")

resolvers += "Typesafe repository" at "https://repo.typesafe.com/typesafe/releases/"
// The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.3.9")
// web plugins
addSbtPlugin("com.typesafe.sbt" % "sbt-coffeescript" % "1.0.0")

addSbtPlugin("com.typesafe.sbt" % "sbt-less" % "1.0.0")

addSbtPlugin("com.typesafe.sbt" % "sbt-jshint" % "1.0.1")

addSbtPlugin("com.typesafe.sbt" % "sbt-rjs" % "1.0.1")

addSbtPlugin("com.typesafe.sbt" % "sbt-digest" % "1.0.0")

addSbtPlugin("com.typesafe.sbt" % "sbt-mocha" % "1.0.0")

resolvers += Classpaths.sbtPluginReleases
addSbtPlugin("org.scoverage" %% "sbt-scoverage" % "0.99.11")
addSbtPlugin("org.scoverage" %% "sbt-coveralls" % "0.99.0")
