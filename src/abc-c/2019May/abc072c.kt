fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val l = readLine()!!.split(" ").map { it.toInt() }
    var ll = mutableListOf<Int>()
    l.forEach{
        ll.add(it - 1)
        ll.add(it)
        ll.add(it + 1)
    }
    println(ll.groupBy { it }.mapValues { it.value.count() }.values.max())
}