package module01

fun main() {
    // TODO: val
    println("---Val---")
    val variable01 = "Kelvin"
    println("The value of variable01 is $variable01")
    println("---------------\n")
    // variable01 = "Tandrio" # Error: Val cannot be reassigned [ because val is finale, so you cannot change that value ] #

    // TODO: var
    println("---Var---")
    var variable02 = "Kotlin"
    println("You learn $variable02 Programming")
    variable02 = "Java" // var can change value
    println("You learn $variable02 Programming")
    println("---------------\n")

    // TODO: Data Type
    val a = 1 // Integer
    val b = 1.2 // Double
    val c = 1.3f // Float
    val d = true // Boolean
    val e = 2L // Long
    println("The value of 'a' is $a")
    println("The value of 'b' is $b")
    println("The value of 'c' is $c")
    println("The value of 'd' is $d")
    println("The value of 'e' is $e")
    // TODO: Operator
    println("The value of 'a+b' is ${a+b}")
    println("The value of 'b+c' is ${b+c}")
    println("The value of 'c+a' is ${c+a}")
}