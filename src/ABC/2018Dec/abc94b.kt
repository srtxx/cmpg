import java.math.*
fun main(args: Array<String>) {
    val (n, m, x) = readLine()!!.split(" ").map { it.toInt() }
    val a = readLine()!!.split(" ").map(String::toInt)
    println(Math.min(a.filter{ c -> c < x }.count(), a.filter{ c -> c > x}.count()))
}