fun main(args: Array<String>) {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    var l = mutableListOf<Int>()
    for (i in 0 until n) l.add(readLine()!!.toInt())
    l = l.sorted().toMutableList()
    println(n + ((m - l.sum()) / l[0] ))
}