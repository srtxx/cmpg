fun main(args: Array<String>) {
    val v = listOf<String>("N", "NNE", "NE", "ENE", "E", "ESE", "SE", "SSE", "S", "SSW", "SW", "WSW", "W", "WNW", "NW", "NNW","N")
    val p = listOf<Double>(0.3, 1.6, 3.4, 5.5, 8.0, 10.8, 13.9, 17.2, 20.8, 24.5, 28.5, 32.7)
    var (x, y) = readLine()!!.split(" ").map { it.toDouble() }
    x = x / 10.0
    y = (Math.round(y / 60.0 * 10.0) / 10.0)
    var av = v[((x + 11.25) / 22.5).toInt()]
    val ap = p.filter{it -> it <= y}.count()
    if (ap == 0) av = "C"
    println("$av $ap")
}

