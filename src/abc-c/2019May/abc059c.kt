fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val l = readLine()!!.split(" ").map { it.toInt() }
    var s_pls = 0.toLong()
    var s_mns = 0.toLong()
    var pls_cnt = 0.toLong()
    var mns_cnt = 0.toLong()
    for(i in 0 until n){
        s_pls += l[i]
        s_mns += l[i]
        if(i % 2 == 0){
            if(s_pls <= 0){
                pls_cnt += 1 - s_pls
                s_pls = 1
            }
            if(s_mns >= 0){
                mns_cnt += 1 + s_mns
                s_mns = -1
            }
        }
        else{
            if(s_mns <= 0){
                mns_cnt += 1 - s_mns
                s_mns = 1
            }
            if(s_pls >= 0){
                pls_cnt += 1 + s_pls
                s_pls = -1
            }
        }
    }
    println(Math.min(Math.abs(pls_cnt), Math.abs(mns_cnt)))
}