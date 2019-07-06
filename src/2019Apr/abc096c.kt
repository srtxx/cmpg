fun main(args: Array<String>) {
    var a = "Yes"
    val (x, y) = readLine()!!.split(" ").map { it.toInt() }
    var l = (0 until y).map{ "." + readLine()!! + "."}.toMutableList()
    l.add(0, ".".repeat(x + 2))
    l.add(".".repeat(x + 2))
    for(i in 1 until y + 1){
        for(j in 1 until x + 1){
            if(l[i][j] == '#'){
                if(l[i - 1][j] != '#' && l[i + 1][j] != '#' && l[i][j - 1] != '#' &&l[i][j + 1] != '#'){
                    a = "No"
                }
            }
        }
    }
    println(a)
}