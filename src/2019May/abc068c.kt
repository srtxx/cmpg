fun main(args: Array<String>) {
    var n = readLine()!!.toLong()
    var a = when((n % 11).toInt()){
        0 -> (n / 11) * 2
        1, 2, 3, 4, 5, 6 -> (n / 11) * 2 + 1
        else -> (n / 11) * 2 + 2
    }
    println(a)
}