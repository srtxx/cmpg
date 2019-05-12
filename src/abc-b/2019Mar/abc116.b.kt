fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    var a = 0
    var l = mutableListOf(n)
    for(i in 1..100000){
        when(l.last() % 2){
            0 -> l.add(l.last() / 2)
            1 -> l.add(l.last() * 3 + 1)
        }
        if(l.distinct() != l && a == 0){
            a = i + 1
        }
    }
    println(a)
}