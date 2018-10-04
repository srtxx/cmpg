fun main(args: Array<String>) {
    val s = readLine()!!
    val t = readLine()!!
    val a = listOf('a','t','c','o','d','e','r')
    s.zip(t).all{when(it) {
        in a.map{c -> Pair('@', c)}  -> true
        in a.map{c -> Pair(c, '@')}  -> true
        else -> it.first == it.second
    }}.run{println(if(this) {"You can win"} else {"You will lose"})}
}

// zip ２つの配列をまとめる

