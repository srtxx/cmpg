fun main(args: Array<String>) {
    val l = readLine()!!.split(" ").map { it.toInt() }
    println(Math.max(l[0] + l[3] + l[4],l[1] + l[2] + l[4]))
}