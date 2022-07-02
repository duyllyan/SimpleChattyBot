val DIVISORS = listOf(2, 3, 5, 6)

fun main() {
    val number = readln().toInt()

    for (i in DIVISORS) {
        if (number % i == 0) println("Divided by $i")
    }
}