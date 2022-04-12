import java.util.Scanner

fun main(args : Array<String>) {
    val sc = Scanner(System.`in`)
    val testCases = sc.nextInt()

    for (j in 0 until testCases) {
        val tipesOfCandies = sc.nextInt()
        val cases = readln()
        val split = cases.trim().split(" ")
        var candies = IntArray(split.size)
        for (i in split.indices) {
            candies[i] = split[i].toInt()
        }

        if (tipesOfCandies == 1 && candies[0] > 1) {
            println("NO")
            continue
        }

        var maxs = buscarMax(candies)
        var cont = true
        while (cont) {
            maxs[0]--
            candies[maxs[1]]--
            if (maxs[0] < 2) {
                println("YES")
                cont = false
                continue
            }

            if (maxs[0] > maxs[2]) {
                println("NO")
                cont = false
                continue
            } else if (maxs[0] == maxs[2]) {
                val tmp = maxs[0]
                maxs[0]=maxs[2]
                maxs[2]=tmp
            } else {
                maxs = buscarMax(candies)
            }
        }
    }
}

fun buscarMax(candies : IntArray) : IntArray {
    var maxs = IntArray(4)
    for (i in candies.indices) {
        if (candies[i] >= maxs[0]) {
            maxs[3] = maxs[1] // maxs[3] Index of 2nd biggest maxs[1] index of current Max
            maxs[2] = maxs[0] // maxs[2] value of 2nd biggest maxs[0] value of current Max
            maxs[1] = i
            maxs[0] = candies[i]
        } else if (candies[i] >= maxs[2]) { //Could happen than number is bigger than 2nd but not than max
            maxs[3] = i
            maxs[2] = candies[i]
        }
    }
    return maxs
}
