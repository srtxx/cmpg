import java.lang.Math.pow

fun main(args: Array<String>) {
    var (n,c) = readLine()!!.split(" ").map(String::toDouble)
    println((c * pow(c - 1,n - 1)).toLong())
}