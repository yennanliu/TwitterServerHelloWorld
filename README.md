# TwitterServerHelloWorld
> build dev server via TwitterServer framework

### Quick start 
```bash
### Run simple server 

git clone https://github.com/yennanliu/TwitterServerHelloWorld.git
cd TwitterServerHelloWorld

# method 1) run via sbt
sbt run

# method 2) run the compiled jar
sbt package
java -jar target/myserver-1.0.0-SNAPSHOT.jar &

java -jar target/scala-2.11/twitterserverhelloworld_2.11-1.0.jar &

# then check if server works
curl localhost:7777
```

```bash
### Run advanced server 

sbt run "-alarm_durations='1.seconds,5.seconds': 2 alarm durations
  -help='false': Show this help
  -admin.port=':9990': Admin http server port
  -bind=':0': Network interface to use
  -what='hello': String to return"

# Multiple main classes detected, select one to run:

#  [1] server.AdvancedServer
#  [2] server.BasicServer

# Enter number: 
2

# then visit via browser
localhost:9990

```


### Ref
- official doc
	- https://twitter.github.io/twitter-server/
- pass args to SBT
	- https://alvinalexander.com/scala/sbt-how-pass-command-line-arguments-sbt-run/
