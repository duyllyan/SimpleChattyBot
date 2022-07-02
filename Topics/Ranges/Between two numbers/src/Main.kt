fun main() {
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    val num3 = readln().toInt()

    val output = num1 in num2..num3

    println(output)
}