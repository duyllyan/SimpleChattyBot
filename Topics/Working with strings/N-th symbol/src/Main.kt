const val INCREMENT = 1

fun main() {
    val word = readln()
    val n = readln().toInt()

    val output = "Symbol # $n of the string \"${word}\" is \'${word[n - INCREMENT]}\'"
    println(output)
}