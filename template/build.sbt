name := "play"

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.2"

crossScalaVersions := Seq("2.11.2", "2.10.4")

lazy val root = (project in file(".")).enablePlugins(PlayScala)
