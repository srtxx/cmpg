fun main(args: Array<String>) {
    val (a, b, c, x, y) = readLine()!!.split(" ").map { it.toInt() }
    val remaining_p = if(x > y) a else b
    val remaining_c = Math.abs(x - y)
    println(Math.min( a * x + b * y, Math.min(2 * Math.max(x, y) * c, 2 * Math.min(x, y) * c + remaining_c * remaining_p)))
}