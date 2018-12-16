fun main(args: Array<String>) {
    val x = readLine()!!.toInt()
    val y = readLine()!!.toInt()
    val z = readLine()!!.toInt()
    val s = readLine()!!.toInt()
    var a = 0
    for(xx in 0..x) for(yy in 0..y) for(zz in 0..z) if (500 * xx + 100 * yy + 50 * zz == s) a += 1
    println(a)
}