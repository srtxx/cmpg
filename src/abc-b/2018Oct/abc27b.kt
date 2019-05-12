fun main(args: Array<String>) {
    val ans = Array(6) { 0 }
    val s = readLine()!!

    for (ch in s) {
        ans[ch.toInt() - 'A'.toInt()] += 1
    }
    println(ans.joinToString(" "))
}