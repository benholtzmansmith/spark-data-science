import com.bnrs.VehicleCollision
import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.rdd.RDD
import org.apache.spark.sql.SQLContext

object SparkDataScience {

  def main(args: Array[String]) {

    val sparkConf = new SparkConf()

    sparkConf.setMaster( "local" ).
      setAppName( "spark-data-science" )

    val sparkContext = new SparkContext(sparkConf)

    val sqlContext = new SQLContext(sparkContext)

    val nypdData = sqlContext.read.json("/Users/benjaminsmith/ProgrammingProjects/spark-data-science/src/main/resources/nypData.json")

    println(nypdData.toJSON.collect().head)

//    val vehicleCollisions:RDD[VehicleCollision] = ???
//
//    val mapOfAccidents = vehicleCollisions.groupBy(_.borough).mapValues(_.size)
//
//    val accidents = mapOfAccidents.collect()
//
//    accidents.foreach{ x =>
//      println(s"Borough: ${x._1}, Size:${x._2}")
  }

}

