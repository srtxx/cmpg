fun main(args: Array<String>) {
    readLine()!!.toInt()
    val s = (readLine()!!.split(" ").map(String::toInt))
    var n = readLine()!!.toInt()
    for (i in 0 until n){
        var ts = s.toMutableList()
        var (tn,tt) = readLine()!!.split(" ").map(String::toInt)
        ts[tn - 1] = tt
        println(ts.sum())
    }
}
//やるだけ