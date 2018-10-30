fun main(args: Array<String>) {
    val (mn,mx) = readLine()!!.split(" ").map(String::toInt)
    for(x in 0 until readLine()!!.toInt()){
        var tmp = readLine()!!.toInt()
        when(tmp){
            in 0..(mn) -> println(mn - tmp)
            in (mx + 1)..99999 -> println(-1)
            else -> println(0)
        }
    }
}

//simple2000 the・やるだけ