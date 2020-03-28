package module03

fun main() {
    //TODO: filter and filterNot
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenNumber = list.filter { number -> number % 2 == 0 }
    val oddNumber = list.filterNot { number -> number % 2 == 0 }
    println("Even Number : $evenNumber")
    println("Odd Number : $oddNumber")

    //TODO: Map
    val multipleByTwo = list.map { number -> number*2 }
    val dividedByTwo: List<Double> = list.map { number -> (number/2).toDouble() }
    println("Multiple by 2 Number : $multipleByTwo")
    println("Divided by 2 Number : $dividedByTwo")

    //TODO: Count
    val count01 = list.count { it % 2 == 0 }
    val count02 = list.count { (it % 2 == 0) && (it % 4 == 0)}
    println("Count Number Multiple By 2 : $count01")
    println("Count Number Multiple By 2 and 4 : $count02")

    //TODO: Sum and Sorted
    println("Sum : ${list.sum()}")
    println("Sort Ascending : ${list.sorted()}")
    println("Sort Descending : ${list.sortedDescending()}")
}