fun main(args: Array<String>) {
    readLine()
    val l = readLine()!!.split(" ").map { it.toInt() }.sorted()
    println(l.last() - l.first())
}