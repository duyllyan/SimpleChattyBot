object Constant {
    val RANGE = 1..6
}
fun main() {
    var hashtag = "#"
    for (i in Constant.RANGE) {
        println(hashtag)
        hashtag += "#"
    }
}