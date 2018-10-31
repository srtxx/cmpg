//制約が緩いため愚直解で行く

fun main(args: Array<String>) {
    val s = readLine()!!
    val n = readLine()!!.toInt()
    var r = mutableSetOf<String>()
    if (s.length >= n) {
        for (i in 0 until (s.length - n + 1)) {
            r.add(s.substring(i, i + n))
        }
    }
    println(r.count())
}

// iからi + n文字目までを切り取ってリストに突っ込むだけ　やるだけ
// (i in 0 until (s.length - n + 1))が一瞬難しいけど
// [0,1,2,3,4]文字目まであってn = 5なら i = 0のときの一回のみ　n = 4ならi = 0,1の二回…みたいな感じで
// 起点を取れる位置が何回出てくるかでループ回数が決まる ->　文字長　- 切り取り幅より1だけ多い数になる