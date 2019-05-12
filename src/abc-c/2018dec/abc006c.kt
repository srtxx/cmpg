fun main(args: Array<String>) {
    val (x, y) = readLine()!!.split(" ").map { it.toInt() }
    var a = listOf(-1, -1, -1).toMutableList()
    val old = y % 2
    for (i in 0..x){
        if(2 * i + 3 * old + 4 * (x - i - old) == y && x - i - old >= 0) {
            a[0] = i
            a[1] = old
            a[2] = x - i - old
        }
    }
    println(a[0].toString() + " " + a[1] + " " + a[2])
}