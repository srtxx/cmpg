fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val l = (1 .. n).map{ readLine()!!.toString()}
    var ll = mutableListOf(0, 0, 0, 0, 0)
    for(i in 0 until n){
        when(l[i][0]){
            'M' -> ll[0] += 1
            'A' -> ll[1] += 1
            'R' -> ll[2] += 1
            'C' -> ll[3] += 1
            'H' -> ll[4] += 1
        }
    }
    var a = 0.toLong()
    for(i in 0 .. 2) for (j in i + 1..3) for (k in j + 1..4){
        a += (ll[i] * ll[j] * ll[k])
    }
    println(a)
}