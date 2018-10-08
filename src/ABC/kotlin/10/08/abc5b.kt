fun main(args: Array<String>) {
    var t = readLine()!!.toInt()
    var a = listOf<Int>()
    for (i in 0..t - 1) {
        a = a + (readLine()!!.toInt())
    }
    println(a.min())
}


// kotlinのコレクションにはlist,set,mapがある
// list : 重複可能、順序有り
// set  : 重複不可能、順序なし
// map  : keyvalueのペア