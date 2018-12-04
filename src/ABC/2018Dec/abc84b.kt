fun main(args: Array<String>) {
    val (f, s) = readLine()!!.split(" ").map(String::toInt)
    val r = "[0-9]{$f}-[0-9]{$s}".toRegex()
    val a = if(r.matches(readLine()!!)) "Yes" else "No"
    println(a)
}

//正規表現でﾌﾟﾁｮﾍﾝｻﾞ