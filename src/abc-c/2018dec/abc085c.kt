fun main(args: Array<String>) {
    val (x, y) = readLine()!!.split(" ").map { it.toInt() }
    var a = "-1 -1 -1"
    var noguchi = 0
    var ichiyo = 0
    var yukichi = 0
    for(i in 0..x){
        for(j in 0..x)
        if(i * 10000 + j * 5000 + ( x - i - j ) * 1000 == y && x - i - j >= 0){
            yukichi = i
            ichiyo = j
            noguchi = x - i - j
            a = "$yukichi $ichiyo $noguchi"
        }
    }
    println(a)
}