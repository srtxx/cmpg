fun main(args: Array<String>) {
    var s = readLine()!!.toMutableList()
    var r = 0
    while(r == 0){
        s = s.dropLast(1).toMutableList()
        var l = s.count()
        var c = l /2
        if (s.slice(0 until c) == s.slice(c until l)) {
            r = l
        }
    }
    println(r)
}
// とてもイケてない気がする