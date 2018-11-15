import java.util.*

val sc = Scanner(System.`in`)
val A = mutableListOf<String>()
val B = mutableListOf<String>()
var N = 0
var M = 0

fun main(args: Array<String>) {
    N = sc.nextInt()
    M = sc.nextInt()

    for (i in 0 until N) {
        A.add(sc.next())
    }
    for (i in 0 until M) {
        B.add(sc.next())
    }
    for (i in 0 until N) {
        for (j in 0 until N) {
            if (judge(i, j)) {
                println("Yes")
                return
            }
        }
    }
    println("No")
}

fun judge(Ni: Int, Nj: Int): Boolean {
    for (i in 0 until M) {
        for (j in 0 until M) {
            when {
                Ni + i >= N || Nj + j >= N || B[i][j] != A[Ni + i][Nj + j]
                -> return false
            }
        }
    }
    return true
}
