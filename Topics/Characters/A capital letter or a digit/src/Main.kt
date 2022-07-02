fun main() {
    val char = readln().first()
    val result = char in '1'..'9' || char in 'A'..'Z'

    println(result)
}