fun main(args: Array<String>) {
    val x = readLine()!!
    var a = when(x){
        "A" -> "T"
        "T" -> "A"
        "C" -> "G"
        "G" -> "C"
        else -> "AAAAA"
    }
    println(a)

}