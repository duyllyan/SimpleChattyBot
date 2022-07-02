const val DECREMENT = 2

fun main() {
    val number = readln()

    val output = number[number.length - DECREMENT]

    println(output)
}