fun main(args: Array<String>) {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    var l = mutableListOf<Int>()
    for (i in 0 until n){
        var (x, y) = readLine()!!.split(" ").map { it.toInt() }
        if (y <= m) l.add(x)
    }
    var a = if(l.count() == 0) "TLE" else l.min()!!
    println(a)
}