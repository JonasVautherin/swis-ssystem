name := """swiss-system"""

version := "0.1"

scalaVersion := "2.11.8"

resolvers ++= Seq(
  Resolver.sonatypeRepo("releases"),
  "Twitter Maven" at "https://maven.twttr.com")

libraryDependencies ++= List(
  "com.twitter" %% "finatra-http" % "2.5.0",
  "com.typesafe.slick" %% "slick" % "3.1.1",
  "ch.qos.logback" % "logback-classic" % "1.1.7",
  "org.xerial" % "sqlite-jdbc" % "3.14.2.1",
  "org.scalatest" %% "scalatest" % "2.2.6" % "test"
)
