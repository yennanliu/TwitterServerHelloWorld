name := "TwitterServerHelloWorld"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(

"com.twitter" %% "twitter-server" % "20.7.0", 
"org.apache.logging.log4j" % "log4j-slf4j-impl" % "2.1" % Test
)

conflictManager := ConflictManager.latestRevision
