fun main(args: Array<String>) {
    var l = mutableListOf<Int>(1)
    (2..999).map{i ->
        l.add(l.last() + i)
    }

    val x = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
    var i = 0
    while(!l.containsAll(x)){
        i += 1
        x[0] += 1
        x[1] += 1
    }
    println(i)
}

//よくわからないコーナーケースでた　普通に立式して解くらしい