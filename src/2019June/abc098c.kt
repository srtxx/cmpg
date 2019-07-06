fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val s = readLine()!!.toCharArray()
    val maxE = s.sumBy { if (it == 'E') 1 else 0 }
    var e = 0
    var w = 0
    val tnl = mutableListOf<Int>()
    for (c in s) {
        if (c == 'E') e++
        tnl.add(w + maxE - e)
        if (c == 'W') w++
    }
    println(tnl.min())
}