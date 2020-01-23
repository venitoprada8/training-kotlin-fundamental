package module02

fun main() {
    //TODO: When 1
    val a = 6
    when(a%2) {
        0 -> println("$a is even number")
        else -> println("$a is odd number")
    }

    //TODO: When 2
    val b = 15
    val message = when(b) {
        0 -> "$b is even number"
        else -> "$b is odd number"
    }
    println(message)

    //TODO: When 3
    val c: Any = 1.3
    when(c) {
        is Int -> println("$c is integer")
        is Double -> println("$c is double")
        else -> println("$c is undefined")
    }
}