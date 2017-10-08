name := "Play2Demo"
 
version := "1.0"
      
lazy val `play2demo` = (project in file(".")).enablePlugins(PlayScala).settings(serverSettings)

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"

resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"

scalaVersion := "2.12.2"

lazy val serverSettings = Seq(
  libraryDependencies ++=
  Seq( jdbc , ehcache , ws , specs2 % Test , guice,
    "net.sf.barcode4j" % "barcode4j" % "2.0"
  )
)

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )