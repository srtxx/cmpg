fun main(args: Array<String>) {
    readLine()
    var l = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
    var nl = mutableListOf<Int>()
    var c = 0
    while(l.all{ it % 2 == 0}){
        nl = mutableListOf<Int>()
        c += 1
        l.forEach{nl.add(it / 2)}
        l = nl
    }
    println(c)
}