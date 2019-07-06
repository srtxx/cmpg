fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    var rd = mutableListOf<List<Int>>()
    var bd = mutableListOf<List<Int>>()
    for(i in 0 until n){
        val (x, y) = readLine()!!.split(" ").map { it.toInt() }
        rd.add(listOf(x, y))
    }
    for(i in 0 until n){
        val (x, y) = readLine()!!.split(" ").map { it.toInt() }
        bd.add(listOf(x, y))
    }

    rd.sortBy {it[1] * -1}
    var xbd = bd.sortedBy { it[0] }.toList()
    var a = 0
    xbd.forEach{
        var tmpl = rd.filter{that -> that[0] < it[0] && that[1] < it[1]}
        if(tmpl.count() > 0){
            rd.remove(tmpl.first())
            a += 1
        }
    }
    println(a)
}