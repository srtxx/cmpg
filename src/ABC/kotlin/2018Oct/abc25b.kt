fun main(args: Array<String>) {
    val (n,nd,fd) = readLine()!!.split(" ").map(String::toInt)
    var e = 0
    for (n in 0 until n){
        var (v,d) = readLine()!!.split(" ")
        var dd = when{
            (d.toInt() < nd) -> nd
            (d.toInt() > fd) -> fd
            else -> d.toInt()
        }
        e =  when (v){
            "East" -> e + dd
            "West" -> e - dd
            else -> -10000000
        }
    }
    when {
        (e > 0) -> println("East $e")
        (e < 0) -> {
            e = e * -1
            println("West $e")
        }
        else -> println(0)
    }
}

// イケてね〜
// 文字列テンプレート println("West $e")みたいな感じ