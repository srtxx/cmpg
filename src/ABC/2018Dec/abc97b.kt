fun main(args: Array<String>) {
    val x = readLine()!!.toInt()
    val l = mutableSetOf<Int>()
    l.add(1)
    for (i in 2..32) {
        var p = 2
        while (Math.pow(i.toDouble(), p.toDouble()) <= 1000) {
            l.add(Math.pow(i.toDouble(), p.toDouble()).toInt())
            p++
        }
    }
    println(l.filter { it <= x }.max())
}
