import com.trueaccord.scalapb.{ScalaPbPlugin => PB}

scalaVersion := "2.11.7"

name := "akka-scalapb-serialization"
organization := "im.actor"
organizationName := "Actor LLC"
organizationHomepage := Some(new URL("https://actor.im/"))


PB.protobufSettings

PB.runProtoc in PB.protobufConfig := (args => com.github.os72.protocjar.Protoc.runProtoc("-v300" +: args.toArray))

val akkaV = "2.3.13"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaV,
  "com.trueaccord.scalapb" %% "scalapb-runtime" % "0.4.19",
  "com.google.protobuf" % "protobuf-java" % "3.0.0-alpha-3",
  "com.github.ben-manes.caffeine" % "caffeine" % "1.2.0"
)