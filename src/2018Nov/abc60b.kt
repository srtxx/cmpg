fun main(args: Array<String>) {
    val x = readLine()!!
    val y = readLine()!!
    val r = when{
        x.count() > y.count() -> "GREATER"
        x.count() < y.count() -> "LESS"
        else -> when{
            x > y -> "GREATER"
            x < y -> "LESS"
            else -> "EQUAL"
        }
    }
    println(r)
}
// 制約がでかい