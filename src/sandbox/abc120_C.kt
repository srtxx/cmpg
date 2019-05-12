fun main(args: Array<String>) {
    val l = readLine()!!.split("").drop(1).dropLast(1).map { it.toInt() }
    val blue = l.sum()
    val red = l.count() - blue

    if (blue * red == 0) {
        println(0)
    }
    else{
        println(Math.min(blue, red) * 2)
    }
}