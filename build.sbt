name := "spark-data-science"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies  ++= Seq(
  "org.apache.spark" % "spark-core_2.11" % "1.6.1",
  "joda-time" % "joda-time" % "2.9.4",
  "org.apache.spark" % "spark-sql_2.11" % "1.6.1"
)

