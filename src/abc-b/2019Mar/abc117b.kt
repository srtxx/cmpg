fun main(args: Array<String>) {
    readLine()
    val l = readLine()!!.split(" ").map { it.toInt() }
    if(l.max()!! < l.sum() - l.max()!!) println("Yes") else println("No")
}