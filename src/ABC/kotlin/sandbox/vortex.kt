fun main(args: Array<String>) {

    val arsz = readLine()!!.toInt()
    var a = Array(arsz, {arrayOfNulls<Int>(arsz)})
    var v = "right"
    var x = -1
    var y = 0
    var n = 0

    while(n < arsz * arsz){
        n += 1
        when(v){
            "right" ->{
                if(x < arsz - 1 && a[y][x + 1] == null){
                    x += 1
                    a[y][x] = n
                }
                else{
                    y += 1
                    v = "down"
                    a[y][x] = n
                }
            }
            "down" ->{
                if(y < arsz - 1 && a[y + 1][x] == null){
                    y += 1
                    a[y][x] = n
                }
                else{
                    x -= 1
                    v = "reft"
                    a[y][x] = n
                }
            }
            "reft" ->{
                if(x > 0 && a[y][x - 1] == null){
                    x -= 1
                    a[y][x] = n
                }
                else{
                    y -= 1
                    v = "up"
                    a[y][x] = n
                }
            }
            "up" ->{
                if(y > 0 && a[y - 1][x] == null){
                    y -= 1
                    a[y][x] = n
                }
                else{
                    x += 1
                    v = "right"
                    a[y][x] = n
                }
            }
        }
    }
    for (i in 0 until arsz){
        for (j in 0 until arsz){
            print("%03d ".format(a[i][j]))
        }
        println("")
    }
}