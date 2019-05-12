fun main(args: Array<String>) {
    val l = readLine()!!.split(" ").map { it.toInt() }.sorted().toMutableList()
    var a = 0
    val al = l.sorted()
    a += when(l.sum()){
        3 * l[2] - 2 -> 1
        3 * l[2] - 1 -> 2
        else -> 0
    }
    println(a)
}

