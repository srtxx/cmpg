fun main(args: Array<String>) {
    val (x, y) = readLine()!!.split(" ").map { it.toInt() }
    var (mn, mx) = readLine()!!.split(" ").map { it.toInt() }
    for(i in 1 until y){
        var (tmpmn, tmpmx) = readLine()!!.split(" ").map { it.toInt() }
        mn = Math.max(mn, tmpmn)
        mx = Math.min(mx, tmpmx)
    }
    println(Math.max(mx - mn + 1, 0))
}