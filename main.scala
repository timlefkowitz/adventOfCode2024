import java.io.File
import scala.io.Source

object main {
  def main(args: Array[String]): Unit = {
    try {

    println(s"Current working dir : ${new java.io.File(".").getCanonicalPath}")
    val filePath = "data.txt"

    val (leftList, rightList) = Source.fromFile(filePath).getLines().map { line =>
      val Array(right, left) = line.split("\\s+").map(_.toInt)
      (right, left)
    }.toList.unzip
    //val data = Source.fromFile(filePath).getLines().map { line =>
    val sortedLeft = leftList.sorted
    val sortedRight = rightList.sorted

    val distances = sortedLeft.zip(sortedRight).map { case (left, right) =>
      val distance = math.abs(right - left)
      println(s"Pair: ($left, $right), Distance: $distance")
      distance
    }

    val totalDistance = distances.sum

    val smallestLeft = leftList.sorted
    val smallestRight = rightList.sorted

    //val distance = smallestRight - smallestLeft


    println(s"Total sum of all distances: $totalDistance")
  } catch {
    case e: Exception =>
      println(s"Error: ${e.getMessage}")

    //println(s"Smallest pair: ($smallestLeft, $smallestRight)")
    //println(s"Distance: $distance")
  }
  }
}
