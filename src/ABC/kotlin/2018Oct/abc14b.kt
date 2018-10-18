fun main(args: Array<String>) {
    var (x,y) = readLine()!!.split(" ").map(String::toInt)
    val a = readLine()!!.split(" ")
    var r = 0
    for (i in 0 until x) {
        val c = y % 2
        r += a[i].toInt() * c
        y /= 2
    }
    println(r)
}

// bit演算童貞を捨てた
// cはcurrent_bit i番目のビットの時点のTrue/Falseを出してる
// 最後にy / 2して次のbitへ