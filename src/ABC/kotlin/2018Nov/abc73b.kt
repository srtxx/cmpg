//fun main(args: Array<String>) {
//    val n = readLine()!!.toInt()
//    var r = mutableSetOf<Int>()
//    for (i in 0 until n){
//        var (s,e) = readLine()!!.split(" ").map(String::toInt)
//        var p =  (s..e)
//        r = r.union(p).toMutableSet()
//    }
//    println(r.count())
//}
// なんか微妙かも　-> tleでた

fun main(args: Array<String>) {
    var r = 0
    for (i in 0 until readLine()!!.toInt()){
        var (s,e) = readLine()!!.split(" ").map(String::toInt)
        r += (e - s + 1)
    }
    println(r)
}
