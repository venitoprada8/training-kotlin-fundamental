package module05

fun main() {
    6.dataNumber

    val name = "Kelvin"
    val programming = "Kotlin"
    name.dataName(programming)
}

val Int.dataNumber
    get() = println("You input number $this")

fun String.dataName(program: String) {
    println("Hello $this, You learn $program Programming")
}