fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val a = mutableListOf<Int>()
    for (w in 1..n){
        var h = n / w
        a.add(Math.abs(w - h) + n % (w * h))
    }
    println(a.min())
}

// やってみたら意外とイケた
// untilとレンジの使い分けを間違えていた