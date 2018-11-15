fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val a = mutableListOf<Long>(1)
    for (i in 1..n){
        a.add(a[i - 1] * i % 1000000007)
    }
    println(a[n])
}
//テーブルで再帰するだけ