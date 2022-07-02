fun main() {
    val number = readln().toInt()

    val output = if (number % 2 == 0) "EVEN" else "ODD"

    println(output)
}