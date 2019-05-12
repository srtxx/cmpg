fun main(args: Array<String>) {
    val l = arrayOf<Long>(3, 5, 7).toMutableSet()
    var new_l = arrayOf<Long>().toMutableSet()
    var n = readLine()!!.toLong()
    var left = 1
    while (left < n){
        new_l = arrayOf<Long>().toMutableSet()
        left *= 10
        l.map{ it -> new_l.add(it * 10 + 3)}
        l.map{ it -> new_l.add(it * 10 + 5)}
        l.map{ it -> new_l.add(it * 10 + 7)}
        l += new_l
    }
    println(l.filter{it -> it.toString().contains('3') && it.toString().contains('5') && it.toString().contains('7') }.filter{ it -> it <= n}.count())
}

// 候補数を絞り込む
// でかい要素から小さい要素をくくりだす
// 計算過程をDPで使い回す