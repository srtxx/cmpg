fun main(args: Array<String>) {
    val (x, y) = readLine()!!.split(" ").map { it.toInt() }
    val l = readLine()!!.split(" ").map { it.toInt() }
    var boundAt = mutableListOf(0)
    l.forEach{
        boundAt.add(boundAt.last() + it)
    }
    println(boundAt.filter { it <= y }.count())
}