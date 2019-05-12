fun main(args: Array<String>) {
    val (x, y, c) = readLine()!!.split(" ").map { it.toInt() }
    val l = readLine()!!.split(" ").map { it.toInt() }

    println(
        Array(x) { readLine()!!.split(" ").map { it.toInt() } }
            .map { it.foldIndexed(c) { index, sum, value -> sum + (value * l[index]) } }
            .count { it > 0 }
    )
}