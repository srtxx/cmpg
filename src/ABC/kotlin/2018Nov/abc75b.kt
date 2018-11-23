fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val k = readLine()!!.toInt()
    var x=1
    repeat(n){
        x = Math.min(x*2,x+k)
    }
    println(x)
}

// 愚直に比較して小さいものを追加するだけでいいのかもしれない

