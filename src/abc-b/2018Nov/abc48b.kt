fun main(args: Array<String>){
    val (a,b,x) = readLine()!!.split(" ").map(String::toLong)
    var r = b / x
    r -= if (a != 0L) (a - 1) / x else -1
    println(r)
}