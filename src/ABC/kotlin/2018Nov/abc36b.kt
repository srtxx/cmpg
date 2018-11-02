fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    var a = mutableListOf<List<String>>()
    for (i in 0 until n){
        a.add(readLine()!!.split(" "))
    }
    var fa = a.flatten().toString().replace("[^ox]".toRegex(), "")
    for (x in 0 until n){
        for (y in 0 until n){
            print(fa[n * (n - y - 1) + x])
        }
        println("")
    }
}

// 配列を平坦化→xyの二重ループでやった
// なんでこんなに苦しいの？a[N-1-x][y]でよさそうなのに…
// Arrayのほうが楽かも