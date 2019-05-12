fun main(args: Array<String>) {
    var n = readLine()!!.toInt()
    var a = "YES"
    val l = (0..2).map{ readLine()!!.toInt() }.sorted()
    if (l.contains(n)) a = "NO"
    var nl = mutableListOf<Int>()
    for (i in 0 until 100){
        nl = (1..3).map{ n - it }.filterNot{ it -> l.contains(it) }.sorted().toMutableList()
        if (nl.count() != 0) n = nl[0]
        else {
            a = "NO"
            break
        }
    }
    if(n > 0) a = "NO"
    println(a)
}


// 貪欲法