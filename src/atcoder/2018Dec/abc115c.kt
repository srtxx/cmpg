fun main(args: Array<String>) {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    var min = 9999999999
    val p = (1..n).map { readLine()!!.toLong() }.sortedDescending()
    for (i in 0..n - m) {
        var cmin = p[i] - p[i + m - 1]
        if (cmin < min) min = cmin
    }
    println(min)
}