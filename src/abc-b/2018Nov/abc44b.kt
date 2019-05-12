fun main(args: Array<String>) {
    val a = readLine()!!.toMutableList().map(Char::toString).sorted()
    var r = if(a.count() > 1) "Yes" else "No"
    var tmp = ""
    a.forEachIndexed{i,l ->
        when(i % 2){
            0 -> tmp = l
            1 -> if(l != tmp) r = "No"
        }
    }
    println(r)
}

// 20分前後　やるだけだけど手間取った
// 初回のサブミット時に蹴られたコーナーケースは文字が一文字のとき
// 配列の長さが空白一文字分微妙にずれていたから修正した