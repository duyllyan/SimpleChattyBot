
const val NUM10 = 10
const val NUM100 = 100

fun main() {
    val input = readln().toInt()

    val digitOne = input % NUM10
    val digitTwo = input / NUM10 % NUM10
    val digitThree = input / NUM100

    val result = digitOne + digitTwo + digitThree

    println(result)
}