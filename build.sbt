name := "example5"

version := "0.1"

scalaVersion := "2.11.0"

//name := "sparkTutorialScala"

// version := "1.0"

// scalaVersion := "2.11.4"

libraryDependencies ++= {
  val sparkVer = "2.3.0"
  Seq(
    "org.apache.spark" %% "spark-core" % sparkVer % "compile" withSources()
  )
}


// https://mvnrepository.com/artifact/com.microsoft.azure/azure-eventhubs
libraryDependencies += "com.microsoft.azure" % "azure-eventhubs" % "0.6.6"

libraryDependencies ++= Seq(
  "org.twitter4j" % "twitter4j-core" % "3.0.3",
  "org.twitter4j" % "twitter4j-stream" % "3.0.3")

libraryDependencies ++= Seq(
  "org.apache.spark" % "spark-core_2.11" % "2.0.1",
  "org.apache.spark" % "spark-streaming_2.11" % "2.0.1",
  "org.apache.bahir" % "spark-streaming-twitter_2.11" % "2.0.1"
)

libraryDependencies ++= Seq (
  "org.scalatest" %% "scalatest" % "3.0.1" % "test",
  "org.mockito" % "mockito-core" % "2.8.47" % "test"
)

// https://mvnrepository.com/artifact/com.microsoft.azure/azure-eventhubs-spark
libraryDependencies += "com.microsoft.azure" %% "azure-eventhubs-spark" % "2.3.1"
