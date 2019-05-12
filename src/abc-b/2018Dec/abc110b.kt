fun main(args: Array<String>) {
    var a = "War"
    val (n, m, x, y) = readLine()!!.split(" ").map { it.toInt() }
    val e = readLine()!!.split(" ").map { it.toInt() }.sortedDescending()
    val w = readLine()!!.split(" ").map { it.toInt() }.sorted()
    for(i in e[0]..w[0])if(i > x && i < y) a = "No War"
    println(a)
}
