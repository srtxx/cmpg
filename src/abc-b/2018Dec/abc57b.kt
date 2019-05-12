fun main(args: Array<String>) {
    val (x, y) = readLine()!!.split(" ").map { it.toInt() }
    val S = (0 until x).map{readLine()!!.split(" ").map { it.toInt() }}
    val P =  (0 until y).map{readLine()!!.split(" ").map { it.toInt() }}
    var md = mutableListOf<Int>()
    var a = -1
    S.forEachIndexed{si,z ->
        md = emptyList<Int>().toMutableList()
        P.forEachIndexed {pi,zz ->
            md.add(Math.abs(S[si][0] - P[pi][0]) + Math.abs(S[si][1] - P[pi][1]))
        }
        a = md.min()!!
        println(md.indexOfFirst{ it == a} + 1)
    }
}