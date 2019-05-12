fun main(args: Array<String>) {
    val (y, x) = readLine()!!.split(" ").map { it.toInt() }
    val b = (0 until y).map{ readLine()!!}
    var nb = b.toMutableList()
    var t = 0
    for(i in 0 until y) {
        nb[i] = ""
            for(j in 0 until x){
            t = 0
            if (b[i][j] == '.'){
                for(ii in i - 1 .. i + 1){
                    for(jj in j - 1 .. j + 1){
                        if (ii in 0 until y && jj in 0 until x){
                            if (b[ii][jj] == '#') {
                                t += 1
                            }
                        }
                    }
                }
                nb[i] += t.toString()
            }
            else nb[i] += "#"
        }
    }
    nb.forEachIndexed { i, s ->  println(nb[i])}
}