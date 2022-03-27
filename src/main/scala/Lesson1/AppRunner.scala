package Lesson1

import org.apache.spark.sql.{DataFrame, SparkSession}

object AppRunner {

  val spark: SparkSession = SparkSession.builder().master("local[2]").getOrCreate()

  def main(args: Array[String]): Unit = {

    val path = "/home/alexander/airport.csv" // переменная с путем к файлу
    val readOptions =
      Map(
        "header" -> "true", // заголовок
        "inferShema" -> "true"
      )

    val df: DataFrame = spark.read.options(readOptions).csv(path) // чтение файла csv

    df.printSchema()

    println(s"Здесь ${df.count} строк")

    df.show(numRows = 20, truncate = false)

  }
}
