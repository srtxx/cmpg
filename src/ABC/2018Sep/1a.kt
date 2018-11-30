fun main(args: Array<String>) {
  val (a, b) = readLine()!!.split(" ").map(String::toInt)
  println(if (a * b % 2 == 0) "Even" else "Odd")
}
