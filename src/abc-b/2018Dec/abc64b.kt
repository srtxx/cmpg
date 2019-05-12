fun main(args: Array<String>) {
    readLine()
    val x = readLine()!!.split(" ").map { it.toInt() }.sorted()
    println(x.last() - x.first())
}