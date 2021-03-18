import java.util.*

fun main(){
    val input = Scanner(System.`in`).nextInt()
    println(if(input > 2 && input % 2 == 0) "YES" else "NO")
}