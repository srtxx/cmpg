fun main(args: Array<String>) {
    val l = readLine()!!.toString().map { it.toInt() - 48}
    val n = readLine()!!.toInt()
    if(l.filter { it == 1 }.count() == l.count() || l.take(n).filter{ it == 1} == l.take(n) ) println("1")
    else println(l.filter{ it != 1}.first())
}
