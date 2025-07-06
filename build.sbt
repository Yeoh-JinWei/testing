name := "PRG2104-Final-Assignment"

version := "0.1"

scalaVersion := "2.13.10"

// JavaFX dependencies
libraryDependencies ++= Seq(
  "org.openjfx" % "javafx-controls" % "24.0.1",
  "org.openjfx" % "javafx-fxml" % "24.0.1",
  "com.github.tototoshi" %% "scala-csv" % "2.0.0",
  "org.scalafx" %% "scalafx" % "24.0.0-R35"
)

// JVM options for JavaFX
javaOptions ++= Seq(
  "--module-path", "/path/to/javafx/lib",
  "--add-modules", "javafx.controls,javafx.fxml"
)

// Fork JVM for run
fork := true