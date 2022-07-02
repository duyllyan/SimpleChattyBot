fun main() {
    val numberOne = readln().toInt()
    val numberTwo = readln().toInt()
    val numberThree = readln().toInt()

    println(numberOne != numberTwo && numberTwo != numberThree && numberThree != numberOne)
}