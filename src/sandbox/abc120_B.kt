fun main(args: Array<String>) {
    val (x, y, z) = readLine()!!.split(" ").map { it.toInt() }
    var dnl = mutableListOf<Int>()
    for (i in 1 .. 100){
        if (x % i == 0 && y % i == 0) dnl.add(i)
    }
    dnl = dnl.reversed().toMutableList()
    println(dnl[z - 1])
}