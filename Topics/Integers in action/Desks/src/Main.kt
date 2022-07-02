const val DIVISOR = 2u

fun main() {
    val firstNumber = readln().toUInt()
    val secondNumber = readln().toUInt()
    val thirdNumber = readln().toUInt()

    val quantity = findQuantity(firstNumber) + findQuantity(secondNumber) + findQuantity(thirdNumber)

    println(quantity)
}

private fun findQuantity(n: UInt): UInt {
    return n / DIVISOR + n % DIVISOR
}