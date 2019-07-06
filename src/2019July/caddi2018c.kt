import java.math.BigInteger

fun main(args: Array<String>) {
    val (n, p) = readLine()!!.split(" ").map { it.toLong() }
    println(solve(n, p))
}

fun solve(n: Long, p: Long): Long {
    if (n >= 60) return 1
    if (n == 1L) return p
    var max = 1L
    var x = 1L
    while (true) {
        if (BigInteger.valueOf(x).pow(n.toInt()) > BigInteger.valueOf(p)) {
            break
        }
        val xp = BigInteger.valueOf(x).pow(n.toInt()).toLong()
        if (p % xp == 0L) {
            max = x
        }
        x++
    }
    return max
}
