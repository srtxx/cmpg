fun main(args: Array<String>) {
    val s = readLine()!!
    val n = readLine()!!.toInt()
    val sc = s.count()
    var l = mutableListOf<String>()
    for (i in 0 until sc){
        for(j in 0 until sc - i){
            if(j <= n){
                l.add(s.substring(i .. i + j))
            }
        }
    }
    var al = l.toSet().sorted()
    println(al[n - 1])
}

// 8行目がミソ
// substring()はrangeでやったほうがええ