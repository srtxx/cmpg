fun main(args: Array<String>) {
    var a = readLine()!!.toLowerCase()
    var r = when (a.length) {
        0 -> ""
        1 -> a.toUpperCase()
        else -> a[0].toUpperCase() + a.substring(1)
    }
    println(r)
}

// toLowerCaseとtoUpperCaseでいい感じにできる