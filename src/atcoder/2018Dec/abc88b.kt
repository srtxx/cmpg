fun main(args: Array<String>) {
    var x = readLine()!!.toInt()
    var c = readLine()!!.split(" ").map(String::toInt).sortedDescending()
    val p1 = c.filterIndexed{ i,p -> i % 2 == 0}.sum()
    val p2 = c.filterIndexed{ i,p -> i % 2 == 1}.sum()
    println(p1 - p2)
}

// ぐちょくにやるならこう　上手い人は交互に+-掛けてsum()してた