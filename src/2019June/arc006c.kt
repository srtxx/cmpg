fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    var top = mutableListOf(readLine()!!.toInt())
    var tmp = 0
    for(i in 0 until n - 1){
        tmp = readLine()!!.toInt()
        if( tmp > top.max()!! ){
            top.add(tmp)
        }
        else{
            top.remove(top.filter { it -> it >= tmp }.min()!!)
            top.add(tmp)
        }
        top = top.sorted().toMutableList()
    }
    println(top.count())
}