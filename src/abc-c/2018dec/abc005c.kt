fun main(args: Array<String>) {
    var a = "yes"
    val t = readLine()!!.toInt()
    readLine()
    var l = readLine()!!.split(" ").map { it.toInt() }
    val n = readLine()!!.toInt()
    var ll = readLine()!!.split(" ").map { it.toInt() }
    for (i in 0 until n){
        if (l.filter{it >= ll[i] - t && it <= ll[i]}.count() != 0){
            l = l.dropWhile { it <= ll[i] - n }.drop(1)
        }
        else a = "no"
    }
    println(a)
}