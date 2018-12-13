fun main(args: Array<String>) {
    var a = "Yes"
    val l =(1..readLine()!!.toInt()).map{ readLine()!! }.toMutableList()
    if (l.count() != l.toSet().count()) a = "No"
    for(i in 0 until l.count() - 1){
        if(l[i].last() != l[i + 1].first()) a = "No"
    }
    println(a)
}