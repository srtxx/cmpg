fun main(args: Array<String>) {
    val (x, y) = readLine()!!.split(" ").map { it.toInt() }
    println( Math.pow(100.0, x.toDouble()).toInt() * (y + ((y - 1) / 99)) )
}