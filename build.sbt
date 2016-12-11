name              := "Basic Scala Test App"

version           := "1.0"

scalaVersion      := "2.11.8"

publishMavenStyle := true

organization      := "com.epam.basicscalaapp"

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.11" % "2.2.6" % "test",
  "org.pegdown" % "pegdown" % "1.4.2" % "test",
  "org.seleniumhq.selenium" % "selenium-java" % "2.46.0",
  "org.seleniumhq.selenium" % "selenium-firefox-driver" % "2.46.0",
  "org.scalamock" %% "scalamock-scalatest-support" % "3.2" % "test",
  "io.github.bonigarcia" % "webdrivermanager" % "1.5.0" % "test",
  "org.scalacheck" %% "scalacheck" % "1.12.0" % "test"
)

testOptions in Test += Tests.Argument(TestFrameworks.ScalaTest, "-h", "target/html-report")
