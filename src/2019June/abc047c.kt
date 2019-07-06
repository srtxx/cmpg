fun main(args: Array<String>) {
    val s = readLine()!!
    var color = s[0]
    var a = 0
    for (i in 1..(s.length - 1)) {
        if (color != s[i]) {
            color = s[i]
            a++
        }
    }
    println(a)
}