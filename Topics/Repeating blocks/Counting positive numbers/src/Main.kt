fun main() {
    val n = readln().toInt()
    var positiveNumbers  = 0

    repeat(n) {
        val next = readln().toInt()
        if (next > 0) positiveNumbers++
    }

    println(positiveNumbers)
}