const val NUMBER_MAX = 10

fun main() {
    val number = readln().toInt()
    val result = number < NUMBER_MAX

    println(result)
}