fun main(args: Array<String>) {
    var a = mutableListOf<Int>()
    for(i in 0 until readLine()!!.toInt()){
        a.add(readLine()!!.toInt())
    }
    println(a.sum() - a.max()!! / 2)
}