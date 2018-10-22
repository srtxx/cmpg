fun main(args: Array<String>) {
    readLine()!!
    val e = readLine()!!.split(" ")
    readLine()!!
    val r = readLine()!!.split(" ")
    if (r != r.distinct() || r.contains(e[0]) || r.contains(e[1])) println("NO") else println("YES")
}

// ちょっと賢そうな問題でびっくりした　解説を見たら腹落ちした 短く書けたけど無駄なreadLine()がダサい
// strindex.add ("直線グラフ")
// 知見：負の値の持たない直線グラフの最短を考える際、頂点は全て異なり、閉路を持たない　（そうなんや）
// List.distinct()との差で重複を検査するなどした