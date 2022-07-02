import kotlin.math.pow
const val MIN = 0
const val MAX = 1000
const val X3 = 3
const val X2 = 2

fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    val d = readln().toInt()

    for (i in MIN..MAX) {
        if (a * i.toDouble().pow(X3).toInt() + b * i.toDouble().pow(X2).toInt() + c * i + d == 0) {
            println(i)
        }
    }
}