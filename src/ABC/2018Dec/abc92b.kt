fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val (d,x) = readLine()!!.split(" ").map(String::toInt)
    val b = (0 until n).map{(d - 1) / readLine()!!.toInt()}
    println(b.sum() + x + n)
}