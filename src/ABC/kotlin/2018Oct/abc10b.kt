fun main(args: Array<String>) {
    var a = listOf<Int>(2,4,5,6,8,10)
    readLine()!!.toInt()
    val n = readLine()!!.split(" ").map(String::toInt)
    var c = 0
    n.forEach{
        var tmp = it
        while (a.contains(tmp)){
            c += 1
            tmp -= 1
        }
    }
    println(c)
}

//val n = readLine()!!.split(" ").map(String::toInt)でlistに配列を詰める