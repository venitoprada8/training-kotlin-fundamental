package module07

import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    println("Start")
    val start = System.currentTimeMillis()
    val capital = async { getCapital() }
    println("1 Seconds")
    val income = async { getIncome() }
    println("4 Seconds")
    val finish = System.currentTimeMillis()
    println("Your profit is ${income.await() - capital.await()}")
    println("Timer : ${finish-start}")
}