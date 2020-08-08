name := "TwitterServerHelloWorld"

version := "1.0"

scalaVersion := "2.11.8"


libraryDependencies ++= Seq(

"com.twitter" %% "twitter-server" % "20.7.0"
)

conflictManager := ConflictManager.latestRevision
