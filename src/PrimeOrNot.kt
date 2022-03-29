import java.util.Scanner
import kotlin.math.sqrt

//Write a Kotlin program to determine whether a number is prime or not
// O(n*log(n))
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    println("How many numbers will you enter?")
    val n = sc.nextInt()

    val primes = ArrayList<Int>()
    println("Enter your $n numbers...")
    for (i in 0 until n) {
        val int = sc.nextInt()
        if (isPrime(int)) {
            primes.add(int)
        }
    }
    println(primes.toString())
}

fun isPrime(number: Int) : Boolean {
    return number > 1 && (2.rangeTo(sqrt(number.toDouble()).toInt())).none{number % it == 0}
}
