fun main(args: Array<String>) {
    val l = mutableListOf<Int>()
    var d = 0
    var n = readLine()!!.toInt()
    for(i in 1..200){
        d = 0
        for(j in 1..100){
            if (i % (2 * j + - 1) == 0) d += 1
        }
        if (d == 8) l.add(i)
    }
    println(l.filter{ it <= n }.count())
}