import java.io.File
import scala.io.Source

object main {
  def main(args: Array[String]): Unit = {
    try {

    println(s"Current working dir : ${new java.io.File(".").getCanonicalPath}")
    val filePath = "data.txt"

     
    println(s"")
  } catch {
    case e: Exception =>
      println(s"Error: ${e.getMessage}")

    //println(s"Smallest pair: ($smallestLeft, $smallestRight)")
    //println(s"Distance: $distance")
  }
  }
}
