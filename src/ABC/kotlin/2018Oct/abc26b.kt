fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    var a = mutableListOf<Int>()
    for(i in 0 until n){
        a.add(readLine()!!.toInt())
    }
    a.sortDescending()
    var r = 0
    a.forEachIndexed { i, a -> if (i % 2 ==0) r += a*a else r -= a*a }
    println(r * Math.PI)
}

// 逆順に並び替えて交互に赤白赤白…と塗った　やるだけ
// a.sortDescending()逆順にソート
// a.forEachIndexed() 引数を取るforEach()