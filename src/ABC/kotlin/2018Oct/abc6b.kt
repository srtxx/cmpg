fun main(args: Array<String>) {
    var r = mutableListOf<Int>(0, 0, 1)
    var t = readLine()!!.toInt()
    for(i in 3 until t){
        var next = (r[i-1] + r[i-2] + r[i-3])
        r.add(next % 10007)
    }
    println(r[t - 1])
}


// メモ化動的計画表　完全に理解した
// と思っていたが　違った　TLE出る
// += じゃなくて　add するようにしたら余裕だった　なぜ？

//fun fib(x: Int): Int{
//    var r =  when(x) {
//        0, 1 -> 0
//        2 -> 1
//        else -> fib(x - 3) + fib(x - 2) + fib(x - 1)
//    }
//    return if (r > 10007) r % 10007 else r
//}
//
//fun main(args: Array<String>) {
//    println(fib(readLine()!!.toInt()))
//}

// 再帰　スタックオーバーフローで死んだ

