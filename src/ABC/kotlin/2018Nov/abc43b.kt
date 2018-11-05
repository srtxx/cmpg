fun main(args: Array<String>) {
    val a = readLine()!!.split("")
    var r = mutableListOf<String>()
    a.forEach{
        when(it){
            "0" -> r.add("0")
            "1" -> r.add("1")
            "B" -> if (r.count() > 0) r = r.dropLast(1).toMutableList()
        }
    }
    println(r.reduce{x, y -> x + y})
}

// 35分　やるだけなのに手間取った
//mutableList.なんちゃらかんちゃらで返されるのはkotlinのユニットであり、再度代入するには.toMutableList()しないといけない　学びがあった