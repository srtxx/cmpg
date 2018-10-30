fun main(args: Array<String>) {
    var r = 0
    for (i in 0 until 12){
        var t = readLine()!!
        if (t.contains("r")) r += 1
    }
    println(r)
}

// やるだけ