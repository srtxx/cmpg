fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val l = readLine()!!.split(" ").map { it.toInt() }
    var variable = 0
    var colors = mutableListOf(0, 0, 0, 0, 0, 0, 0, 0)
    l.forEach{
        when(it){
            in 1 .. 399 -> colors[0] = 1
            in 400 .. 799 -> colors[1] = 1
            in 800 .. 1199 -> colors[2] = 1
            in 1200 .. 1599 -> colors[3] = 1
            in 1600 .. 1999 -> colors[4] = 1
            in 2000 .. 2399 -> colors[5] = 1
            in 2400 .. 2799 -> colors[6] = 1
            in 2800 .. 3199 -> colors[7] = 1
            in 3200 .. 4800 -> variable += 1
        }
    }
    if (colors.sum() == 0){
        println("1 " + variable)
    }
    else {
        println(colors.sum().toString() + " " + (colors.sum() + variable))
    }
}