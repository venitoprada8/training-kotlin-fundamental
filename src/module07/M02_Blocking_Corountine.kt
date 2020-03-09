package module07

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    println("Start")
    val start = System.currentTimeMillis()
    GlobalScope.launch {
        delay(1000L)
        println("World!")
    }
    println("Hello,")
    runBlocking { /** Blocked for 5 seconds **/
        delay(5000L)
    }
    val finish = System.currentTimeMillis()
    println("Timer : ${finish-start}")
    println("Finish")
}