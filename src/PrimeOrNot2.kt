import java.util.Scanner

//Write a Kotlin program to determine whether a number is prime or not
// O(n*log(n))
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    println("How many numbers will you enter?")
    val n = sc.nextInt()

    val numbers = IntArray(n)
    println("Enter your $n numbers...")
    for (i in 0 until n) {
        numbers[i] = sc.nextInt()
    }
    val primes = numbers.filter { isPrime(it) }
    println(primes.toString())
}
