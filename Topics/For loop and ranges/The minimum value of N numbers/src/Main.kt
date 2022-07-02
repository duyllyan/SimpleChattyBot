fun main() {
    val number = readln().toInt()
    var minimum = Integer.MAX_VALUE

    for (i in 1..number) {
        val next = readln().toInt()
        if (next < minimum) minimum = next
    }

    println(minimum)
}