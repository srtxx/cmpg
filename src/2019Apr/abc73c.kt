fun main(args: Array<String>) {
    (1 .. readLine()!!.toInt()).map{ readLine()!!.toInt()}.groupBy { it }.mapValues { it.value.count() }.let{ println(it.values.filter { it % 2 != 0 }.count())}
}