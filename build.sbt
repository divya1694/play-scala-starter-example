
name := """play-scala-starter-example"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

resolvers += "Artifactory-Sbt" at "https://artifactory.insuranceinbox.com/artifactory/inbox-all-sbt/"

scalaVersion := "2.11.11"


libraryDependencies +="net.codingwell" %% "scala-guice" % "4.0.1"
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test
libraryDependencies += "com.h2database" % "h2" % "1.4.196"
