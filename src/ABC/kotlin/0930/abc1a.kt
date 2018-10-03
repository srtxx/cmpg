fun main(args: Array<String>){
   val (d) = readLine()!!.split(" ").map(String::toInt)
  println(
        when (d) {
            in 1..99 -> "00"
            in 100..999 -> String.format("0%d",d / 100)
            in 1000..5000 -> d / 1000
            in 6000..30000 -> d / 1000 + 50
            in 35000..70000 -> (d / 1000 - 30) / 5 + 80
            else -> "89"
        }
    )
}
// whenは超強力
// 謎のコーナーケースが通らなかった 意味がわからない…

