fun main(args:Array<String>) {
    val (s,e,n) = readLine()!!.split(" ").map{ it.toLong() }
    (s..e).take(n.toInt())
        .plus( (s..e).reversed().take(n.toInt()) )
        .distinct()
        .sorted()
        .forEach { println(it) }
}

// 作ったリスト全部見たらtleでる　うえからいくつかだけでいい