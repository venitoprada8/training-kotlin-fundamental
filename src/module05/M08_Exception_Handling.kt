package module05

fun main() {
    //TODO: with 3 exception
    /*ArithmeticException
    NumberFormatException
    NullPointerException*/

    //TODO: try-catch
    println("TRY - CATCH")
    val numberOne = 5
    try {
        println(numberOne/3)
    } catch (e: ArithmeticException) {
        println("You get not undefined")
    }

    //TODO: try-catch-finally
    println("\nTRY - CATCH - FINALLY")
    val numberTwo = "6.0"
    var escaped = false
    try {
        println(numberTwo.toInt())
        escaped = true
    } catch (e: NumberFormatException) {
        println("You cannot convert to Int")
    } finally {
        when(escaped) {
            true -> println("You escaped")
            false -> println("You failed")
        }
    }

    //TODO: multiple-catch
    println("\nMULTIPLE CATCH")
    val numberThree: String? = null
    var errorOne = false
    var errorTwo = false
    var errorThree = false
    try {
        println(numberThree?.toInt()!!.div(0))
        println(numberThree.toInt())
    } catch (e: ArithmeticException) {
        errorOne = true
    } catch (e: NumberFormatException) {
        errorTwo = true
    } catch (e: NullPointerException) {
        errorThree = true
    } finally {
        if (!errorOne && !errorTwo && !errorThree) {
            println("You escaped")
        }
        else {
            println("You failed")
            if (errorOne) println("You get not undefined")
            if (errorTwo) println("You cannot convert to Int")
            if (errorThree) println("The value must not be null")
        }
    }
}