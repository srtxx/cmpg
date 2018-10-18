fun main(args: Array<String>) {
    var a = mutableListOf(readLine()!!.toInt())
    a.add(readLine()!!.toInt())
    var mx = a.max()!!
    var mn = a.min()!!
    var r = if(mx - mn <= 5) mx - mn else mn - mx + 10
    println(r)
}

//listに詰めて比較して分岐させる