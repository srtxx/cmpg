import java.lang.Math.*

fun main(args: Array<String>) {
    val (w,a,b) =readLine()!!.split(" ").map(String::toInt)
    println(max(max(a,b) - w - min(a,b),0))
}
// やるだけ　チンカス
