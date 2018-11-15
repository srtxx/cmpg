fun main(args: Array<String>) {
    val s = Array(3) { "" }

    for (i in 0..s.lastIndex) {
        s[i] = readLine()!!
    }

    var turn = 0

    while (s[turn] != "") {
        val pre = turn
        turn = s[turn][0] - 'a'

        s[pre] = s[pre].removeRange(0, 1)
    }

    println('A' + turn)
}