fun main(args: Array<String>) {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    var ng = (1 .. m).map{ readLine()!!.toInt() } + 100000000
    var dp = LongArray(n + 1)
    dp[0] = 0
    if(n == 1){
        if (ng[0] == 1){
            println(0)
            return
        }
        else{
            println(1)
            return
        }
    }
    else if(ng[0] == 1){
        if(ng[1] == 2){
            dp[1] = 0
            dp[2] = 0
            ng = ng.drop(2)
        }
        else {
            dp[1] = 0
            dp[2] = 1
            ng = ng.drop(1)
        }
    }
    else if(ng[0] == 2){
        dp[1] = 1
        dp[2] = 0
        ng = ng.drop(1)
    }
    else{
        dp[1] = 1
        dp[2] = 2
    }


    for (i in 3 .. n){
        if (ng[0] == i){
            dp[i] = 0
            ng = ng.drop(1)
        }
        else{
            dp[i] = ((dp[i - 1] + dp[i - 2]) % 1000000007)
        }
    }

    println(dp.last())
}