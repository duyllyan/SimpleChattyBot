fun main() {
    val number = readln().toInt()
    var square = 1

    while (square * square <= number) {
        println(square * square)
        square++
    }
}