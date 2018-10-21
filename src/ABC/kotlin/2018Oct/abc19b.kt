fun main(args: Array<String>) {
    val s = readLine()!!
    val r = mutableListOf<String>()
    var ts = s[0]
    var tn = 0
    for (i in 0 until s.length){
        if (s[i] != ts){
            r.add(ts.toString())
            r.add((i - tn).toString())
            ts = s[i]
            tn = i
        }
    }
    r.add(ts.toString())
    r.add((s.length - tn).toString())
    println(r.joinToString(separator = ""))
}

//　大学一年生の情報工学科の学生の課題みたいなコードになってしまった　もっとイケていたい（ワナビー的発言）
// joinToString(separator:)みたいなやつはたまに使いそう