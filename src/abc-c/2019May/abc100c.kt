fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val l = readLine()!!.split(" ").map { it.toInt() }
    var a = 0
    var tmp = 0
    for(i in 0 until n){
        tmp = l[i]
        while (tmp % 2 == 0){
            a += 1
            tmp /= 2
        }
    }
    println(a)
}