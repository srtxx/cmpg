fun main(args: Array<String>) {
    val x = readLine()!!
    var a = mutableListOf<Int>()
    for(i in 0 until x.count() - 2) {
        a.add(Math.abs(753 - x.substring(i..i+2).toInt()))
    }
    println(a.min())
}