fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    var m = 0
    var fm = -1
    var fn = ""
    for (i in 0 until n){
        var(tn, tm) = readLine()!!.split(" ")
        m += tm.toInt()
        if(fm < tm.toInt()){
            fm = tm.toInt()
            fn = tn
        }
    }
    if (fm > m / 2) println(fn) else println("atcoder")
}

// 毎回tmをtoInt()しないといけないのはなぜ？