fun main(args: Array<String>) {
    val n = 1000000007
    val (x,y,z) = readLine()!!.split(" ").map(String::toLong)
    var xy = (x * y % n)
    println((xy * z) % n)
}
// 途中であまり出すやーつ知ってたらやるだけ
//　ワンライナー版
//　fun main(args: Array<String>) {
//　    println(readLine()!!.split(" ").map { it.toLong() }.fold(1L) { x, y -> x * y % 1000000007})
//　}