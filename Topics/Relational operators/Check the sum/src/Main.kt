const val TWENTY = 20

fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    println(equals20(a, b) || equals20(b, c) || equals20(c, a))
}

private fun equals20(a: Int, b: Int): Boolean {
    return a + b == TWENTY
}
