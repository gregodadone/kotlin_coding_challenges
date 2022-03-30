class Singleton private constructor(public var str: String) {
    companion object {
        private val singleton = Singleton("Hello world")
        fun getInstance() = singleton
    }
}

//class Singleton { // Another way of constructing
//    public var str: String
//    private constructor(str: String) {
//        this.str = str
//    }
//}

fun main(args : Array<String>) {
    // val sing = Singleton("HOLA") Forbidden
    val singleton = Singleton.getInstance()
    println(singleton.str)
    singleton.str = "Something else"
    println(singleton.str)
}
