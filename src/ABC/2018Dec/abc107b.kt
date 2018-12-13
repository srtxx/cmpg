fun main(args: Array<String>) {
    val (y, x) = readLine()!!.split(" ").map { it.toInt() }
    val p = (1..y).map { readLine()!!}.filter { it.contains("#") }
    var np = mutableListOf<String>()
    for (xx in 0 until x) {
        var tmp = ""
        for (yy in 0 until p.count()){
            tmp += p[yy][xx]
        }
        np.add(tmp)
    }
    np = np.filter { it.contains("#") }.toMutableList()
    for (ax in 0 until np.count()) {
        var a = ""
        for (ay in 0 until np.count()){
            a += np[ay][ax]
        }
        println(a)
    }
}