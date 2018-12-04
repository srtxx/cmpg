fun main(args: Array<String>) {
    var s = String(readLine()!!.toCharArray().sortedArray())
    var t = String(readLine()!!.toCharArray().sortedArrayDescending())
    println(if (t > s) "Yes" else "No")
}


// kotlinであればソートした文字式同士で大小比較ができる（すごい）
