fun main(args: Array<String>) {
    val l = (0 until readLine()!!.toInt()).map{ readLine()!!.toInt() }.sorted()
    when(l.count()){
        1 -> println(l[0])
        2 -> println(l.max())
        3 -> println(Math.max(l[0] + l[1], l[2]))
        4 -> println(Math.min(Math.max(l[0] + l[1] + l[2], l.last()), Math.max(l[1] + l[2], l[0] + l[3])))
    }
}