fun main(args: Array<String>) {
    readLine()
    val x = readLine()!!.split(" ").toSet()
    val a = if (x.count() == 4) "Four" else "Three"
    println(a)
}
// 愚直に