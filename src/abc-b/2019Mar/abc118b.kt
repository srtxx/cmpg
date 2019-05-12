fun main(args: Array<String>) {
    val (x, y) = readLine()!!.split(" ").map { it.toInt() }
    var l = Array<Int>(y, {it * 0}).toMutableList()
    for(i in 0 until x){
        val ll = readLine()!!.split(" ").map { it.toInt() }
        for(j in 1 .. ll[0]){
            l[ll[j] - 1] += 1
        }
    }
    println(l.filter{it == x}.count())
}