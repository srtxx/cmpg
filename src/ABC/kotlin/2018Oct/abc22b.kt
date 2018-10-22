

//fun main(args: Array<String>) {
//    val n = readLine()!!.toInt()
//    var a = mutableListOf<String>()
//    var r = 0
//    for(i in 0 until n){
//        var tmp = readLine()!!.toString()
//        if (a.contains(tmp)) r += 1 else a.add(tmp)
//    }
//    println(r)
//}
//
//
//// 知見：特になし　ideaでコンパイルするときはちゃんと該当ファイルをターゲットにしているか確認しよう
// tle出た　やり直し

fun main(args: Array<String>) {
    var a = mutableListOf<String>()
    for (i in 0 until readLine()!!.toInt()) {
        a.add(readLine()!!)
    }
    println(a.count() - a.distinct().count())
}

// 重複の数が受粉数だからこれでオッケー
// 今回の知見：入力は死ぬほど多い時がある