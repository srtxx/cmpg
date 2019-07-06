fun main(args: Array<String>) {
    val n = readLine()!!.toLong()
    var a = 1000000000
    var b = 0L
    for(i in 1 .. Math.sqrt(n.toDouble()).toInt()){
        b = (n / i.toLong())
        if((i * b) == n){
            var ta = Math.max(i.toLong(), b).toString().count()
            a = Math.min(a, ta)
        }
    }
    println(a)
}