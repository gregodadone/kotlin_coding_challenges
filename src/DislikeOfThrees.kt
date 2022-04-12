import java.util.Scanner

fun main(args : Array<String>){

    var idx = 0;
    var current : Short = 0;
    val k : ShortArray = ShortArray(1000)
    while (idx < 1000) {
        if (current % 3 == 0 || current % 10 == 3) {
            current++
            continue
        }
        k[idx++]=current++
    }
    val sc = Scanner(System.`in`)
    val t = sc.nextByte()
    for (i in 0 until t) {
        println(k[sc.nextInt() - 1])
    }
}
