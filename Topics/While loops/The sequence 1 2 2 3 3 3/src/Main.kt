fun main() {
    val number = readln().toInt()
    var count = 1
    var actual = 1

    while (count <= number) {
        repeat(actual) {
            if (count <= number) print("$actual ")
            count++
        }
        actual++
    }
}