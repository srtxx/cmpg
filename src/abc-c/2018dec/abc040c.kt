fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val l = readLine()!!.split(" ").map { it.toInt() }
    var dp = mutableListOf(0,Math.abs(l[0] - l[1]))
    for (i in 2 until n){
        dp.add(Math.min(dp[i - 1] + Math.abs(l[i - 1] - l[i]), dp[i - 2] + Math.abs(l[i - 2] - l[i])))
    }
    println(dp.last())
}