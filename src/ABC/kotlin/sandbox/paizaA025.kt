fun main(args: Array<String>) {
    var (n, w, mw) = readLine()!!.split(" ").map(String::toInt)
    var a = mutableListOf<Int>(w)
    var ca = mutableListOf<Int>()
    for (i in 0 until n) {
        ca = mutableListOf<Int>()
        var (wl, wg) = readLine()!!.split(" ").map(String::toInt)
        for(j in 0 until a.count()){
            ca.add(a[j] - wl)
            if (a[j] + wg <= mw) ca.add(a[j] + wg)
        }
        a = ca
    }
    println(a.count())
}