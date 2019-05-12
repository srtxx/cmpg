fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val l = readLine()!!.split(' ').map(String::toLong)
    var vctr = 0
    var count = 1

    for (i in 0 until n - 1) {
        if (vctr == 0) {
            if (l[i] < l[i + 1]) {
                vctr = 1
            } else if (l[i] > l[i + 1]) {
                vctr = -1
            }
        } else if (vctr == 1) {
            if (l[i] > l[i + 1]) {
                vctr = 0
                count++
            }
        } else {
            if (l[i] < l[i + 1]) {
                vctr = 0
                count++
            }
        }
    }
    println(count)
}