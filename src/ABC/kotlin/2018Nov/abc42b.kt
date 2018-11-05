fun main(args: Array<String>) {
    var a = mutableListOf<String>()
    val (n,l) = readLine()!!.split(" ").map(String::toInt)
    for (i in 0 until n){
        a.add(readLine()!!.toString())
    }
    println(a.sorted().reduce{x, y -> x + y})
}

// sort()とsorted()の違いをわからされた
// 実装自体は緩め