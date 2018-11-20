fun main(args: Array<String>) {
    val x = readLine()!!.toList()
    var y = x.toSet()
    if (x.count() == y.count()) println("yes") else println("no")
}
// setでワンパン
// stringからsetにできるんだって　すごいね