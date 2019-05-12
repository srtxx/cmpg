fun main(args: Array<String>) {
    val (x, y) = readLine()!!.split(" ").map { it.toInt() }
    val l = readLine()!!.split(" ").map { it.toInt() }
    var a = 999999999
    for (i in 0 .. x - y){
        a = Math.min(a, Math.abs(l[i + y - 1]) + Math.abs(l[i + y - 1] - l[i]))
        a = Math.min(a, Math.abs(l[i]) + Math.abs(l[i + y - 1] - l[i]))
    }
    println(a)
}