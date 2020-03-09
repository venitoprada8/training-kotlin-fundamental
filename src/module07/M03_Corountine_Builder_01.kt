package module07

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

suspend fun getCapital(): Int {
    delay(1000L)
    return 50000
}

suspend fun getIncome(): Int {
    delay(3000L)
    return 75000
}

fun main() = runBlocking {
    println("Start")
    val start = System.currentTimeMillis()
    val capital = getCapital()
    println("1 Seconds")
    val income = getIncome()
    println("4 Seconds")
    val finish = System.currentTimeMillis()
    println("Your profit is ${income - capital}")
    println("Timer : ${finish-start}")
}