fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    for (i in 0..200){
        var tmp = (i * i * i * i)
        if(tmp == n) println(i)
    }
}

// 思いつかなかった　pow(0.25)でやる方法があるみたい