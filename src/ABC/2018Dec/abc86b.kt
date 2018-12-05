import java.math.*

fun main(args: Array<String>) {
    val n = readLine()!!.replace(" ","").toDouble()
    val a = if(Math.sqrt(n) % 1 == 0.0) "Yes" else "No"
    println(a)
}

// 言うことなし