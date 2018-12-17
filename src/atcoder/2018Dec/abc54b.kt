fun main(args: Array<String>) {
    var a = "No"
    var t = "t"
    val (x, y) = readLine()!!.split(" ").map { it.toInt() }
    val l = (1..x).map{ readLine()!!}
    val o = (1..y).map{ readLine()!!}
    for(i in 0 until (x - y + 1)){
        for(j in 0 until (x - y + 1)){
            t = "t"
            o.forEachIndexed { ii, q ->
                for(jj in 0 until y){
                    if(l[i + ii][j + jj] != o[ii][jj]) t = "f"
                }
            }
            if (t == "t") a = "Yes"
        }
    }
    println(a)
}