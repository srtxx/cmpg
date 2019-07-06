fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val l = readLine()!!.split(" ").map{it.toInt()}
    var tmp = 0
    for(i in 1 until n - 1){
        if(l[i] == l.subList(i - 1, i + 2).sorted()[1]){
            tmp += 1
        }
    }
    println(tmp)
}