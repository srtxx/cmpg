fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val s = readLine()!!

    println((1 until n).map { i ->
        s.subSequence(0..i).toSet().intersect(s.subSequence(i until n).toSet()).count()
    }.max()!!)
}
