package module02

fun main() {
    // TODO: Range
    val range01 = 1..10 // Range Integer
    val range02 = 1.rangeTo(10) // 1, 2, 3, ... , 10
    val range03 = 10.downTo(1) // 10, 9, 8, ... , 1
    val range04 = 1..10 step 2 // 1, 3, 5, ... , 10
    val range05 = range03 step 3 // 10, 7, 4, 1
    val range06 = 'A'..'F' // A, B, C, D, E, F Range Char

    //TODO: For Looping
    for (i in range01){
        print("$i ")
    }
    println("\n--------------------------")

    for (i in range02){
        print("$i ")
    }
    println("\n--------------------------")

    for (i in range03){
        print("$i ")
    }
    println("\n--------------------------")

    for (i in range04){
        print("$i ")
    }
    println("\n--------------------------")

    for (i in range05){
        print("$i ")
    }
    println("\n--------------------------")

    for (i in range06){
        print("$i ")
    }
    println("\n--------------------------")
}