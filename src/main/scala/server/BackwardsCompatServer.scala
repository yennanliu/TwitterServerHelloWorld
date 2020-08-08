// package server

// import com.twitter.conversions.DurationOps._
// import com.twitter.finagle.http.{Request, Response, Status}
// import com.twitter.finagle.Service
// import com.twitter.server.TwitterServer
// import com.twitter.server.logging.{Logging => JDK14Logging}
// import com.twitter.util.{Await, Future, Time}
// import java.net.InetSocketAddress

// object BackwardsCompatServer extends TwitterServer with JDK14Logging {

//   val what = flag("what", "hello", "String to return")
//   val addr = flag("bind", new InetSocketAddress(0), "Bind address")
//   val durations = flag("alarms", (1.second, 5.second), "2 alarm durations")
//   val counter = statsReceiver.counter("requests_counter")
//   override def failfastOnFlagsNotParsed: Boolean = true


//   val service = new Service[Request, Response] {
//     def apply(request: Request) = {
//       log.debug("Received a request at " + Time.now)
//       val response = Response(request.version, Status.Ok)
//       response.contentString = what() + "\n"
//       Future.value(response)
//     }
//   }


//   def main(): Unit = {
//     // We could create a new http server but in this case we use the
//     // one already started for /admin/* endpoints.
//     // The `TwitterServer` trait exposes an `adminHttpServer` that serve all routes
//     // registered in the HttpMuxer object, we just have to add our own.
//     HttpMuxer.addHandler("/echo", service)
//     HttpMuxer.addHandler("/echo/", service)
//     // And wait on the server
//     Await.ready(adminHttpServer)
//   }
// }