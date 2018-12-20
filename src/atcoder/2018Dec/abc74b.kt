fun main(args: Array<String>) {
    readLine()
    val n = readLine()!!.toInt()
    val l = readLine()!!.split(" ").map { it.toInt() }
    var a = 0
    l.forEach {
        a += min(it, n - it) * 2
    }
    println(a)
}