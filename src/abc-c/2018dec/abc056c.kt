fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    var far = 1
    var tmp = 1
    while(far < n){
        tmp += 1
        far += tmp
    }
    println(tmp)
}