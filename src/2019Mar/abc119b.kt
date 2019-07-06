fun main(args: Array<String>) {
    var a = 0.toDouble()
    for(i in 0 until readLine()!!.toInt()) {
        var l = readLine()!!.split(" ")
        when(l[1]){
            "JPY" -> a += l[0].toDouble()
            "BTC" -> a += l[0].toDouble() * 380000.0
        }
    }
    println(a)
}