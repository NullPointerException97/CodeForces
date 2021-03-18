import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val input = sc.nextInt()

    for (i in 1..input) {
        val word = sc.next()

        if (word.length <= 10)
            println(word)
        else {
            println("${word[0]}${word.length - 2}${word[word.length - 1]}")
        }
    }
}