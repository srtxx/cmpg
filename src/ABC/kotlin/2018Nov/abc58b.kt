fun main(args: Array<String>) {
    val o = readLine()!!
    val e = readLine()!!
    var i = 0
    while(i != e.count()){
        print(o[i])
        print(e[i])
        i += 1
    }
    if (o.count() > e.count()) print(o.last())
}
// やるだけだけど手間取った