fun main(args: Array<String>) {
    val (x, y, z) = readLine()!!.split(" ").map { it.toInt() }
    var a = 0
    var s = mutableListOf<Int>()
    var t = ""
    for (i in 0..x) {
        t = i.toString()
        s = mutableListOf<Int>()
        while(t.count() > 0){
            s.add(t[0].toInt() - 48)
            t = t.substring(1 until t.count())
        }
        if(s.sum() in (y..z)){
            a += i
        }
    }
    println(a)
}