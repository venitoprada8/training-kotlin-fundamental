package module05

import module05.sampleClassObject.mathematic.calculator.Calculator

fun main() {
    val calculator = Calculator()
    println(calculator.multiple(3, 4))
    println(calculator.multiple(3.2, 4.1))
    println(calculator.multiple(3, 4, 5))
}