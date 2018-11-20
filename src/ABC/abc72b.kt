fun main(args: Array<String>) {
    println(readLine()!!.filterIndexed { index, c -> index % 2 == 0 })
}
// filterIndexed{}がいい感じ