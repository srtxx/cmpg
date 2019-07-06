fun main(args: Array<String>) {
    var a = mutableSetOf<Int>()
    for(i in 0 until readLine()!!.toInt()){
        a.add(readLine()!!.toInt())
    }
    println(a.sortedDescending()[1])
}
// sortedDescending 逆順
// 知らんけどsetだから重複を考えなくて良いから楽