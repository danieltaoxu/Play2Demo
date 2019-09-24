
resolvers += Resolver.sonatypeRepo("snapshots")

lazy val commonSettings = Defaults.coreDefaultSettings ++ Seq(
  organization := "com",
  // Semantic versioning http://semver.org/
  version := "0.1.0-SNAPSHOT",
  scalaVersion := "2.13.0",
  scalacOptions ++= Seq(
    "-feature",
    "-deprecation",
    "-Xfatal-warnings"
  )
)

lazy val `play2demo` = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(commonSettings)
  .settings(
    name := "Play2Demo",
    description := "tryPlay",
    publish / skip := true,
    libraryDependencies ++= Seq(
      guice,
      "net.sf.barcode4j" % "barcode4j" % "2.1",
      "org.scalatestplus.play" %% "scalatestplus-play" % "4.0.3" % Test
    )
)

// resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"

// resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"


/* lazy val serverSettings = Seq(
  libraryDependencies ++=
  Seq( jdbc , ehcache , ws , specs2 % Test , guice,
    "net.sf.barcode4j" % "barcode4j" % "2.0"
  )
) */

// unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )