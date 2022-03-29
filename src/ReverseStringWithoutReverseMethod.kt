import java.util.*

//Write a Java program to reverse a string without using the reverse method of Java's String class
//Complexity O(n)
fun main(args : Array<String>) {
    val scanner = Scanner(System.`in`)
    println("Enter String to reverse:")
    val st = scanner.nextLine()

    val sb = StringBuilder()
    for (i in st.length-1 downTo 0) {
        sb.append(st[i])
    }
    scanner.close()

    println(sb.toString())
}
