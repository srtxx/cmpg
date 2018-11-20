fun main(args: Array<String>) {
    val m = (readLine()!!.split(" ").map(String::toInt))[1]
    println(readLine()!!.split(" ").map(String::toInt).sorted().takeLast(m).sum())
}
// 問題文に合わせて蛇のように長いコードでお届け
// ただの貪欲法