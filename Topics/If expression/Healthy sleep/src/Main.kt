fun main() {    
    val a = readln().toInt()
    val b = readln().toInt()
    val h = readln().toInt()

    val output = when {
        h < a -> "Deficiency"
        h in a..b -> "Normal"
        else -> "Excess"
    }

    println(output)
}