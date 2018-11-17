fun main(args: Array<String>) {
    val (y,x) = readLine()!!.split(" ").map(String::toInt)
    var e = ("#".repeat(x + 2))
    println(e)
    for(i in 0 until y){
        println("#" + readLine()!! + "#")
    }
    println(e)
}