fun main(args: Array<String>) {
    val m1 = readLine()!!.split(" ")
    val m2 = readLine()!!.split(" ")
    val r = if( m2.contains(m1[0]) || m2.contains(m1[1]) ) "YES" else "NO"
    println(r)
}

// やるだけなのに手間取った
//　なんも難しいことないけど手こずったし簡易的な実装を心がけることにする