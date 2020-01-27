package module04

fun main() {
    //TODO: Extension Functions
    println("Case 1 : 3 + 4 = ${3.getNumber(4)}") // Extension type Int
    println("Case 2 : -8 + 3 = ${(-8).getNumber(3)}") // Extension type Int
    "Kelvin".getData("Brigitta") // Extension Type String

    //TODO: Extension Properties
    println("Case 3 : 5.3/2 = ${(5.3).num}") // Extension properties type double, return double
    println("Case 4 : ${7.num02}") // Extension properties type int, return string

    //TODO: Nullable Receiver
    val value = null
    println("Case 5 : ${value?.num03}") // giving safe calls in parameters
    println("Case 6 : ${value.num04}") // without safe calls because in 'num04' is given that
}

fun Int.getNumber(number: Int): Int {
    return this + number
}

fun String.getData(couple: String) {
    println("$this and $couple")
}

val Double.num: Double
    get() = this/2

val Int.num02: String
    get() = "You input data $this"

val Int.num03: Int
    get() = this

val Int?.num04: Int
    get() = this ?: 0 // using elvis to get error