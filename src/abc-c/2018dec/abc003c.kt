fun main(args: Array<String>) {
    val (x, y) = readLine()!!.split(" ").map { it.toInt() }
    val l = readLine()!!.split(" ").map { it.toDouble() }.sorted()
    var a = 0.0
    l.subList(x - y, x).map{ it -> a = (a + it) / 2}
    println(a)
}