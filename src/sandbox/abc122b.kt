fun main(args: Array<String>) {
    val s = readLine()!!
    var a = 0
    var sl = s.length
    for (i in 0 until sl){
        var na = 0
        for (j in i until sl){
            if(s[j] == 'A' || s[j] == 'C' || s[j] == 'G' || s[j] == 'T'){
                na += 1
            }
            else {
                a = Math.max(a, na)
                na = 0
            }
        }
        a = Math.max(a, na)
    }
    println(a)
}