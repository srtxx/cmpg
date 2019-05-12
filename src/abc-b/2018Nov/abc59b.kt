fun main(args: Array<String>) {
    val (x,y,z) = readLine()!!.split(" ").map(String::toInt)
    val a = mutableListOf<Int>()
    for (i in 0 until y){
        a.add(x * i % y)
    }
    var r = if(a.contains(z)) "YES" else "NO"
    println(r)
}
// 考察系　解説見ないとわからなかった
// xy % y は0になるのは自明やしそれまで回して割れないなら割れないってこと