version := "0.1.0-SNAPSHOT"

scalaVersion := "2.12.15"
val akkaVersion = "2.6.16"
val akkaHttpVersion = "10.2.7"

libraryDependencies ++= List(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-persistence" % akkaVersion,
  "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,

  "org.iq80.leveldb" % "leveldb" % "0.9",
  "org.fusesource.leveldbjni" % "leveldbjni-all" % "1.8",
)