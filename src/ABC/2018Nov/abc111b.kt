fun main(args: Array<String>) {
    var n = readLine()!!.toInt()
    while (n % 111 != 0){
        n += 1
    }
    println(n)
}

// 3分くらい　クソ簡単　流石にやるだけ