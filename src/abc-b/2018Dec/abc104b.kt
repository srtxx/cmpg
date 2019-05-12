fun main(args: Array<String>) {
    val r = """^A[a-z]+C[a-z]+$""".toRegex()
    val a = if (r.matches(readLine()!!)) "AC" else "WA"
    println(a)
}