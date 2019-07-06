fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val l = readLine()!!.split(" ").map { it.toInt() }
    var currentGcd = l[0]
    for(i in 0 until n){
        currentGcd = gcd(currentGcd, l[i])
    }
    println(currentGcd)
}

fun gcd(a: Int, b: Int) :Int{
    if (b == 0) return Math.abs(a)
    return gcd(b, a % b)
}