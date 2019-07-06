fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val l = readLine()!!.split(" ").map { it.toInt() }
    var a = 1
    var mx = l[0]
    for(i in 1 until n){
        if(mx <= l[i]){
            a += 1
            if(mx < l[i]){
                mx = l[i]
            }
        }
    }
    println(a)
}