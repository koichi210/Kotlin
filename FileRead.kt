import java.nio.file.Files
import java.nio.file.Paths

fun main(args: Array<String>) {
  val path = Paths.get("/sample.txt")
  val lines = Files.readAllLines(path)
  for (line in lines) {
    println(line)
  }
}