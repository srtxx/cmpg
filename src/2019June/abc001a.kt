fun main(args: Array<String>) {
    val l = readLine()!!.toCharArray().sorted()
    (if(l[0] == l[1] && l[2] == l[3] && l[0] != l[3]) "Yes" else "No").let{ println(it)}
}