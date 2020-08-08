name := "TwitterServerHelloWorld"

version := "1.0"

scalaVersion := "2.11.8"

resolvers += Resolver.sonatypeRepo("snapshots")

libraryDependencies ++= Seq(

"com.twitter" %% "twitter-server" % "20.7.0", 
"org.apache.logging.log4j" % "log4j-slf4j-impl" % "2.1" % Test,
"org.slf4j" % "slf4j-api" % "1.7.25"

)

//mainClass := Some("server.BasicServer")

conflictManager := ConflictManager.latestRevision
