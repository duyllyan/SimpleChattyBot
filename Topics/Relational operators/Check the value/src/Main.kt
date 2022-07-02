const val NUMBER_MIN = 0
const val NUMBER_MAX = 10

fun main() {
    val number = readln().toInt()
    val result = number > NUMBER_MIN && number < NUMBER_MAX
    println(result)
}
