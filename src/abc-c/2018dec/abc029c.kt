fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    var l = mutableListOf("a", "b", "c")
    var tmpl = l
    if (n > 1){
        for(i in 0 until n){
            tmpl = l.toMutableList()
            l.map{ it -> tmpl.add("a" + it) }
            l.map{ it -> tmpl.add("b" + it) }
            l.map{ it -> tmpl.add("c" + it) }
            l = tmpl.toMutableSet().toMutableList()
        }
    }
    l.filter{ it -> it.count() == n}.forEach { println(it) }
}