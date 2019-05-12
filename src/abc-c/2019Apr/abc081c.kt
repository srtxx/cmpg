fun main(args: Array<String>) {
    val (x, n) = readLine()!!.split(" ").map { it.toInt() }
    val l = readLine()!!.split(" ").map { it.toInt() }.groupBy { it }.mapValues { it.value.count() }.values.sortedDescending()
    println(l.sum() - l.take(n).sum())
}