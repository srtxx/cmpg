fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val l = (0 until n).map{
        readLine()!!.toMutableList().map{ it.toInt() - 'a'.toInt()}
    }
    var mf = IntArray(26, {9999} )
    l.forEach{
        var f = IntArray(26)
        it.forEach{ f[it]++ }
        for(i in 0 until 26){
            mf[i] = Math.min(mf[i], f[i])
        }
    }
    for(i in 0..25){
        repeat(mf[i]){
            print((i+'a'.toInt()).toChar())
        }
    }
    println()

}

// 各入力の最小の値がそれぞれのアルファベットのリピート数