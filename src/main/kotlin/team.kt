import java.util.*

fun main(){
    val sc = Scanner(System.`in`)

    val number = sc.nextInt()

    var count  = 0
    for(i in 1..number){
        val a1 = sc.nextInt()
        val a2 = sc.nextInt()
        val a3 = sc.nextInt()

        if(a1 + a2 + a3 >= 2){
            count ++
        }
    }

    println(count)
}