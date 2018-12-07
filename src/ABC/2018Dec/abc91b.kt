fun main(args : Array<String>) {
    val b = (0 until readLine()!!.toInt()).map { readLine()!! }
    val r = (0 until readLine()!!.toInt()).map { readLine()!! }
    val a = b.toSet().map { str -> b.count{it==str} - r.count{it==str} } + 0
    println(a.max())
}
