fun main(args: Array<String>) {
    val (n, m) = readLine()!!.split(' ').map{it.toLong()}
    when {
        2 * n > m -> (m / 2)
        else -> ((m - 2 * n) / 4 + n)
    }.let{ println(it) }
}