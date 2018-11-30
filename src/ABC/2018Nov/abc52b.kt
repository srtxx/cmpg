fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    var a = readLine()!!
    var r = 0
    var rm = 0
    for (i in 0 until n){
        when(a[i]) {
            'I' -> {
                r += 1
                if(r > rm) rm = r
            }
            'D' -> {
                r -= 1
            }
        }
    }
    println(rm)
}

//やるだけ