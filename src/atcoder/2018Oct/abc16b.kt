fun main(args: Array<String>) {
    val (a,b,c) = readLine()!!.split(" ").map(String::toInt)
    val r = when(b){
        0 -> when(c){
            a -> '?'
            else -> "!"
        }
        else -> when(c){
            a + b -> "+"
            a - b -> "-"
            else -> "!"
        }
    }
    println(r)
}

// whenで一個一個ケース割り当ててくだけ
// b = 0のときが判別不能なのでその点だけ書き分ける