fun main(args: Array<String>) {
    var n = readLine()!!.toLong()
    var l = Array(5) {
        readLine()!!.toLong()
    }
    println((n - 1) / l.min()!! + 5)
}

// 数学的考察ゲー
// 数字を動かして考えたら気づくはずだった　猛省