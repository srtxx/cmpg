fun main(args: Array<String>) {
    val (n, t) = readLine()!!.split(' ').map { it.toInt() }
    var s = - 1000000
    var r = 0

    for (i in 0 until n) {
        val ai = readLine()!!.toInt()
        r += Math.min(ai - s, t)
        s = ai
    }
    println(r)
}