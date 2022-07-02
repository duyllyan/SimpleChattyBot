fun main() {

    val number = readln().toInt()

    val output = when {
        number < 0 -> "negative"
        number > 0 -> "positive"
        else -> "zero"
    }

    println(output)
}