fun main(args: Array<String>) {
    val l = readLine()!!.toString().map { it.toInt() - 48}
    var over = l.sum() - 7
    var vct = mutableListOf<String>("+", "+", "+")
    var bit = mutableListOf(0, 0, 0)
    var bitminussum = 0
    var tmp = 0
    var bitweight = 0
    for(i in 0 until 8){
        tmp = i
        bit = mutableListOf(0, 0, 0)
        bitminussum = 0
        for(j in 0 until 3) {
            bitweight = Math.pow(2.0, (2 - j).toDouble()).toInt()
            if (tmp >= bitweight) {
                bit[j] = tmp / bitweight
                tmp -= bitweight
            }
        }
        for (j in 0 until 3){
            bitminussum += l[j + 1] * bit[j]
        }
        if(bitminussum * 2 == over){
            for (j in 0 until 3){
                if(bit[j] == 1){
                    vct[j] = "-"
                }
            }
            break
        }
    }
    println(l[0].toString() + vct[0] + l[1] + vct[1] + l[2] + vct[2] + l[3] + "=7")
}