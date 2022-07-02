const val INCREMENT = 1

fun main() {
    val char1 = readln().first()
    val char2 = readln().first()
    val char3 = readln().first()

    val result = char2 == char1 + INCREMENT && char3 == char2 + INCREMENT

    println(result)
}