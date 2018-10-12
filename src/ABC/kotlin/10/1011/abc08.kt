fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    var m = hashMapOf<String, Int>()
    
    for (i in 0 until n){
        val tmp = readLine()!!
        m[tmp] = (m[tmp] ?: 0) + 1
    }
    var a =  m.maxBy{it.value}.toString()
    println(a.replace("[^a-z]+".toRegex(),""))
}

// ？は存在するときは左を返してないときは右を返すらしい　すごい
// 最後正規表現を噛ましてるのが最高にいけてない　悔しい

