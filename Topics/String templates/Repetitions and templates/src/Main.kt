fun main() {
    // write your code here
    val word = readln()
    val wordLength = word.length

    println("$wordLength repetitions of the word $word: ${word.repeat(wordLength)}")
}