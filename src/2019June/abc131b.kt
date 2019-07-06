fun main(args: Array<String>) {
    val (x, y) = readLine()!!.split(" ").map { it.toInt() }
    (y until x+y).toList().let{ println(it.sum() + (it.map{Math.abs(it)}.min()!! * if(it.sum() >= 0) -1 else 1))}
}