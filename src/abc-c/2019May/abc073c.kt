fun main(args: Array<String>) {
    val (x, y) = readLine()!!.split(" ").map { it.toInt() }
    var l = readLine()!!.split(" ").map { it.toLong() }.toMutableList()
    l.add(Long.MAX_VALUE)
    var a = 0L
    var current = 0L
    for(i in 0 until x){
        current = l[i]
        if(current + y > l[i + 1]){
            a += l[i + 1] - l[i]
        }
        else{
            a += y
        }
    }
    println(a)
}