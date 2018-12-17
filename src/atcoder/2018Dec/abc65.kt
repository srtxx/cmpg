fun main(args: Array<String>) {
   val a = readLine()!!.toInt()
   val s = (0 until a).map{ readLine()!!.toInt()}
   var b = 1
   var c = 0
   while(c <= a && b != 2){
      c += 1
      b = s[b - 1]
   }
   println(if (c > a) "-1" else c)
}