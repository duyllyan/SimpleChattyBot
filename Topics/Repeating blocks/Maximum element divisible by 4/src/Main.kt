fun main() {
    val n = readln().toInt()
    var maxDivisibleBy4 = 0

    repeat(n) {
        val next = readln().toInt()
        if (next % 4 == 0 && next > maxDivisibleBy4) maxDivisibleBy4 = next
    }

    println(maxDivisibleBy4)
}