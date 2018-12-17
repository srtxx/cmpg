fun main(args: Array<String>) {
    val v = readLine()!!.toInt()
    var a = "No"
    for (i in 0..25){
        for(j in 0..14){
            if(4 * i + 7 * j == v) a = "Yes"
        }
    }
    println(a)
}