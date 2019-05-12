fun main(args: Array<String>) {
    val s = readLine()!!
    println(s.first() + (s.count() - 2).toString() + s.last())
}
// 正規表現でリプレイスしたほうが美しいかも