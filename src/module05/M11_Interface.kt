package module05

interface ICoffee {
    val milk: Int
    fun typeCoffee()
}

fun main() {
    val coffee = Coffee(0)
    coffee.typeCoffee()
}

class Coffee(override val milk: Int) : ICoffee {
    override fun typeCoffee() {
        when(milk) {
            1 -> println("Cappucino")
            0 -> println("Coffee")
        }
    }
}