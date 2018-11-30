fun main(args: Array<String>) {
    var m = readLine()!!.toInt()
    println(arrayOf(1,2,4,8,16,32,64).filter{n -> n <= m}.max() )
}