fun main(args: Array<String>) {
    val s= readLine()!!
    println("abcdefghijklmnopqrstuvwxyz".firstOrNull{ it !in s }?:"None")
}

// 2ライナーで行けるのやべえな