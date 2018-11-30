import java.lang.Math.*

fun main(args: Array<String>) {
    var (we,he,n) = readLine()!!.split(" ").map(String::toInt)
    var ws = 0
    var hs = 0
    for(i in 0 until n){
        var (w,h,v) = readLine()!!.split(" ").map(String::toInt)
        when(v){
            1 -> ws = max(ws,w)
            2 -> we = min(we,w)
            3 -> hs = max(hs,h)
            4 -> he = min(he,h)
        }
    }
    println(max((we - ws),0) * max((he - hs),0))
}