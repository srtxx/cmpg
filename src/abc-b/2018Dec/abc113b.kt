fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val (x, y) = readLine()!!.split(" ").map { it.toInt() }
    var a = readLine()!!.split(" ").map { Math.abs(x - it.toInt() * 0.006 - y) }
    println(a.indexOf(a.min()) + 1)
}