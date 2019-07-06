fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val l = readLine()!!.split(" ").map { it.toInt() }
    var lsum = l.sum()
    var diff = Int.MAX_VALUE
    for(i in 1 until n){
        diff = Math.min(diff, Math.abs(l.take(i).sum() - (lsum - l.take(i).sum())))
    }
    println(diff)
}