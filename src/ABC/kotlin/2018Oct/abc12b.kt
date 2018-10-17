fun main(args: Array<String>) {
    var t = readLine()!!.toInt()
    println(("%02d:%02d:%02d").format(t / 3600,(t % 3600) / 60  ,(t % 3600) % 60))
}

// イージーな実装なのになぜか手こずった印象がある
// String.format(引数)で引数展開可能 
