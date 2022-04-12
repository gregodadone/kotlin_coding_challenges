
fun main(args: Array<String>) {
    println("Enter two strings")

    val string1 = readln()
    val string2 = readln()

    val charArray1 = string1.toCharArray()
    val charArray2 = string2.toCharArray()
    charArray1.sort()
    charArray2.sort()

    println(String(charArray1))
    println(String(charArray2))

    if (charArray1.toTypedArray().contentEquals(charArray2.toTypedArray())) {
        println("Strings are anagrams")
    } else {
        println("Strings are not anagrams")
    }
}
