name := """swiss-system"""

version := "0.1"

scalaVersion := "2.11.8"

resolvers ++= Seq(
  Resolver.sonatypeRepo("releases"),
  "Twitter Maven" at "https://maven.twttr.com")

libraryDependencies ++= List(
  "com.typesafe.slick" %% "slick" % "3.1.1",
  "ch.qos.logback" % "logback-classic" % "1.1.7",
  "org.xerial" % "sqlite-jdbc" % "3.14.2.1",

  "org.scalatest" %% "scalatest" % "2.2.6" % "test",
  "org.specs2" %% "specs2" % "2.3.12" % "test",
  "org.scalacheck" %% "scalacheck" % "1.13.4" % "test",
  "org.mockito" % "mockito-core" % "1.9.5" % "test",

  "com.twitter" %% "finatra-http" % "2.5.0",
  "com.twitter" %% "finatra-httpclient" % "2.5.0",

  "com.twitter" %% "finatra-http" % "2.5.0" % "test",
  "com.twitter" %% "finatra-jackson" % "2.5.0" % "test",
  "com.twitter" %% "inject-server" % "2.5.0" % "test",
  "com.twitter" %% "inject-app" % "2.5.0" % "test",
  "com.twitter" %% "inject-core" % "2.5.0" % "test",
  "com.twitter" %% "inject-modules" % "2.5.0" % "test",
  "com.google.inject.extensions" % "guice-testlib" % "4.0" % "test",

  "com.twitter" %% "finatra-http" % "2.5.0" % "test" classifier "tests",
  "com.twitter" %% "finatra-jackson" % "2.5.0" % "test" classifier "tests",
  "com.twitter" %% "inject-server" % "2.5.0" % "test" classifier "tests",
  "com.twitter" %% "inject-app" % "2.5.0" % "test" classifier "tests",
  "com.twitter" %% "inject-core" % "2.5.0" % "test" classifier "tests",
  "com.twitter" %% "inject-modules" % "2.5.0" % "test" classifier "tests"
)
