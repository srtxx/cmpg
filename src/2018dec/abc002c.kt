fun main(args: Array<String>) {
    val l = readLine()!!.split(" ").map { it.toDouble() }
    val xl = l.filterIndexed{i,it -> i % 2 == 0}.map{it -> it - l[0]}
    val yl = l.filterIndexed{i,it -> i % 2 == 1}.map{it -> it - l[1]}
    println(Math.abs((xl[1] * yl[2]) - (xl[2] * yl[1])) / 2)
}