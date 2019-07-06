fun main(args: Array<String>) {
    println(readLine()!!.split(" ").map { it.toInt() }.sorted().dropLast(1).sum())
}