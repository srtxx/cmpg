fun main(args: Array<String>) {
    val x = readLine()!!.toInt()
    var s = 0
    x.toString().forEach { s += it.toString().toInt() }
    var a = if (x % s == 0) "Yes" else "No"
    println(a)
}