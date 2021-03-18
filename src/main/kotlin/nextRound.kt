import java.util.*

fun main(){
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val k = sc.nextInt()
    val numbers = IntArray(n)

    var count = 0
    for(i in 0 until n){
        numbers[i] = sc.nextInt()
        //print(i)
    }

    for(i in 0 until n){
        if(numbers[i] >= numbers[k-1] && numbers[i] != 0)
            count ++
    }

    println(count)

}