fun main(args: Array<String>) {
    val (m,s) = readLine()!!.split(" ").map(String::toInt)
    var r = 0
    for (i in 0..m) {
        for (j in 0..m) {
            if(s - i - j in 0..m) r += 1
        }
    }
    println(r)
}
//解説聞いたらいけた