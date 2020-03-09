package module07

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
    GlobalScope.launch {
        delay(1000L)
        println("1 Seconds Later")
        println("World!")
    }
    println("Start")
    println("Hello,")
    Thread.sleep(5000L)
    println("5 Seconds Later")
    println("Finish")
}