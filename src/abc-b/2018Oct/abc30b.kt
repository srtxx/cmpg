import kotlin.math.roundToLong

fun main(args: Array<String>) {
    var (t,m) = readLine()!!.split(" ").map(String::toDouble)
    t = t % 12 + m / 60.0
    m = m / 5.0
    println(Math.min(Math.abs(t - m) * 30.0 ,Math.abs(m - t) * 30.0).roundToLong())
}

//なんかよくわかんないコーナーケースでた
//実装は正しいと思う