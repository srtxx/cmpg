fun main(args: Array<String>) {
    var a = readLine()!!.split("")
    var x = Math.abs(a.count{ it.contains("R")} - a.count{ it.contains("L") })
    var y = Math.abs(a.count{ it.contains("U")} - a.count{ it.contains("D") })
    var wld = a.count{it.contains("?")}
    when (readLine()!!.toInt()){
        1 -> println(x + y + wld)
        2 -> when{
            x + y > wld -> println(x + y - wld)
            else -> println((wld - x -y) % 2)
        }
    }
}

// 面倒だった　whenで切り分けてやった