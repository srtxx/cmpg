fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val l = readLine()!!.split(" ").map { it.toInt() }.sorted()
    println(l[n / 2] - l[n / 2 - 1])
}