 fun main(args: Array<String>) {
     val n = readLine()!!.toInt()
     val l = readLine()!!.split(" ").map { it.toInt() }
     var slash = mutableListOf<Int>()
     var backslash = mutableListOf<Int>()
     for(i in 0 until n){
         if (i % 2 == 0) slash.add(l[i])
         else backslash.add(l[i])
     }
     val slashmap = slash.groupBy { it }.mapValues { it.value.count() }
     val backslashmap = backslash.groupBy { it }.mapValues { it.value.count() }
     val slashcounts = slashmap.values.take(2)
     val backslashcounts = backslashmap.values.take(2)
     if (slashmap.keys.first() != backslashmap.keys.first()) {
          println(n - slashcounts[0] - backslashcounts[0])
     }
     else{
          if (slashmap.count() == 1 && backslashmap.count() == 1){
               println(n / 2)
          }
          else println(Math.min(n - slashcounts[0] - backslashcounts[1], (n - slashcounts[1] - backslashcounts[0])))
     }
 }