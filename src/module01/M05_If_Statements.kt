package module01

fun main() {
    val number = 124

    // TODO : just if expressions
    println("The value is $number")
    if (number % 2 == 0) {
        println("$number is even number")
    }

    // TODO : if and else expressions
    if (number % 3 == 0) {
        println("$number is a multiple of 3")
    }
    else {
        println("$number is not a multiple of 3")
    }

    // TODO : if, else if, and else expressions
    if (number < 100) {
        println("$number is a number less than 100")
    }
    else if (number >= 100 && number < 200) {
        println("$number is a number between 100 and 200")
    }
    else {
        println("$number is a more than 200")
    }

    // TODO : multiple expressions
    if (number % 4 == 0) {
        if (number % 8 == 0) {
            println("$number is not a multiple of 4 and 8")
        }
        else {
            println("$number is not a multiple of 4 but not 8")
        }
    }
    else if (number % 6 == 0) {
        if (number % 12 == 0) {
            println("$number is not a multiple of 6 and 12")
        }
        else {
            println("$number is not a multiple of 6 but not 12")
        }
    }
}