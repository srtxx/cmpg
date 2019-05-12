//fun main(args: Array<String>) {
//    val (x, y) = readLine()!!.split(" ").map { it.toInt() }
//    val (a, b, c, d, e) = readLine()!!.split(" ").map { it.toInt() }
//    var m = mutableMapOf<Int,Int>(0 to y)
//    var nm = mapOf<Int, Int>()
//    for( i in 0 until x){
//        nm = mutableMapOf<Int, Int>()
//        m.forEach{
//            nm = nm.plus(it.key + a to it.value + b)
//            nm = nm.plus(it.key + c to it.value + d)
//            if(it.value - e > 0) nm = nm.plus(it.key to it.value - e)
//        }
//        m = nm.toMutableMap()
//    }
//    println(m.minBy{it.key}!!.key)
//}

fun main(args: Array<String>) {
    
}