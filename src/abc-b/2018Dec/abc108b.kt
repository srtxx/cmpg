fun main(args: Array<String>) {
    val (x1,y1,x2, y2) = readLine()!!.split(" ").map { it.toInt() }
    val dx = x2 - x1
    val dy = y2 - y1
    println("${x2 - dy} ${y2 + dx} ${x1 - dy} ${y1 + dx} ")
}