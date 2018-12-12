fun main(args: Array<String>) {
    val (n, m, x, y) = readLine()!!.split(" ").map { it.toInt() }
    val l = readLine()!!.split(" ").map { it.toInt() }.filter{ it < n }.toMutableList()
    l += (readLine()!!.split(" ").map { it.toInt() }.filter { it >= m })
    val a = if(l.count() == 0) "No War" else "War"
    println(l)
}
