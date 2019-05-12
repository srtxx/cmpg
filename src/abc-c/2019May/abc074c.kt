fun main(args: Array<String>) {
    val l = readLine()!!.split(" ").map { it.toInt() }
    var cnc = 0.0
    var clwt = mutableListOf<Int>()
    var tmp = 0
    var tmp2 = 0

    var a = Pair<Int,Int>(0, 0)
    while(tmp + l[0] * 100 <= l[5]){
        tmp += l[0] * 100
        clwt.add(tmp)
    }
    var wt = clwt.toMutableSet()

    clwt.forEach{
        tmp = 0
        while(it + tmp + l[1] * 100 <= l[5]){
            tmp += l[1] * 100
            wt.add(tmp + it)
        }
    }
    wt.forEach{

    }
}

