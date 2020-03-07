package module03

fun main() {
    //TODO: Not Using Sequence
    val list = (1..100000).toList()
    val timeStart = System.currentTimeMillis()
    list.filter { it % 5 == 0 }.map { it * 2 }
    val timeFinish = System.currentTimeMillis()

    //TODO: Using Sequence
    val listTwo = (1..100000).toList()
    val timeStartTwo = System.currentTimeMillis()
    listTwo.filter { it % 5 == 0 }.map { it * 2 }
    val timeFinishTwo = System.currentTimeMillis()

    println("Time listOne = ${timeFinish - timeStart}")
    println("Time listTwo = ${timeFinishTwo - timeStartTwo}")
}