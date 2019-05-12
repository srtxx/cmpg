fun main(args: Array<String>) {
    val l = readLine()!!.toString().map { it.toInt() - 48}
    var black = 0
    var white = 0
    for(i in 0 until l.count()){
        if (i % 2 != l[i]) black += 1
        else white += 1
    }
    print(Math.min(black, white))
}

// テーマソング:Black or White?
// 隣り合わないパターンは開幕からずれて二通りしかない
// l = readLine()!!.toString().map { it.toInt() - 48} ←　これベストプラクティスか？