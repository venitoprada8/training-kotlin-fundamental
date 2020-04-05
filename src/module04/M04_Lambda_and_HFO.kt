package module04

fun main() {
    //TODO: Lambda Basic
    message()

    //TODO: Lambda in object Runnable ( just example )
    val runData = Runnable { println("Run") }

    //TODO: Lambda using Parameter
    messageWithParameter("Kotlin Fundamental Yukk...")

    //TODO: High Function Order ( HFO ) Basic
    plusNumberVersionOne(2, 3) { x, y ->
        x + y
    }

    //TODO: High Function Order
    val message = calculator(5, 4) { type, x, y ->
        when(type) {
            "sum" -> x + y
            "minus" -> x - y
            "multiple" -> x * y
            else -> 0
        }
    }
    println(message)
}

val message = { println("Kotlin Fundamental") }
val messageWithParameter = { message: String -> println(message) }

fun plusNumberVersionOne(x: Int, y: Int, sum:(Int, Int) -> Int) {
    val result = sum(x, y)
    println("Version 1 => $x + $y = $result")
}

fun calculator(x: Int, y: Int, result:(String, Int, Int) -> Int): String {
    return "Result => ${result("sum", x, y)}"
}