fun main(args: Array<String>) {
    val (n,m) = readLine()!!.split(" ").map(String::toInt)
    val ans = IntArray(n)
    repeat(m) {
        val (a, b) = readLine()!!.split(" ").map(String::toInt).map(Int::dec)
        ans[a]++
        ans[b]++
    }
    ans.forEach(::println)
}
