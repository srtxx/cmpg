fun main(args: Array<String>) {
    var s = mutableSetOf<Int>()
    for (i in 0 until readLine()!!.toInt()){
        s.add(readLine()!!.toInt())
    }
    println(s.count())
}