fun main(args: Array<String>) {
    val l = readLine()!!.toString().map { it.toInt() - 48 }
    val i = l.joinToString(separator = "").toInt()
    val s = l.sum()
    val a = if(i % s == 0) "Yes" else "No"
    println(a)
}