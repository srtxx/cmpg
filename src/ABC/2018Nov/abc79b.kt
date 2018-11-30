fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val r = mutableListOf<Long>(2,1)
    for (i in 2 until 87){
        r.add(r[i - 1] + r[i - 2])
    }
    println(r[n])
}

// メモ化再帰任せろ
