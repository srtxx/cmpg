fun main(args: Array<String>) {
    var s = "b"
    val n = (readLine()!!.toInt() - 1) / 2
    for(i in 0 until n) {
        when(i % 3){
            0 -> s = "a" + s + "c"
            1 -> s = "c" + s + "a"
            2 -> s = "b" + s + "b"
        }
    }
    if (s == readLine()!!) println(n) else println(-1)
}

// 正解となる文字列を検討して一致しているか検証する
// 時間に余裕があったため
// abcabc...の繰り返しでないといけない→正規表現パンチマンでいける？