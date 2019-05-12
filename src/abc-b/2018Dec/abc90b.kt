fun main(args: Array<String>) {
    val (mn, mx) = readLine()!!.split(" ").map(String::toInt)
    var a = 0
    for(i in mn..mx) if (i.toString() == i.toString().reversed()) a += 1
    println(a)
}

// 思いつくままやった