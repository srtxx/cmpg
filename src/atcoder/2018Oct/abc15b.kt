fun min(a: Int, b: Int) = if (a > b) b else a

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map(String::toInt)
    var x = 0
    var y = 0

    for (i in 0 until n){
        if (a[i] > 0){
            x += 1
            y += a[i]
        }
    }
    val r = y / x + min(1,y % x)
    println(r)
}

// 割り切れる場合は切り上げが発生しないことに留意　実装はそんなに複雑じゃない