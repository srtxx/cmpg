fun main(args: Array<String>) {
    var x = readLine()!!
    var xl = mutableListOf<String>()
    var e = x.count()
    for (i in 0 until e){
        xl.add(x)
        x = x.substring(1, e) + x[0]
    }
    var y = readLine()!!
    var a = if(xl.contains(y)) "Yes" else "No"
    println(a)
}
