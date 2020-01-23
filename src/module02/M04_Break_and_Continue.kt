package module02

fun main() {
    //TODO: Break and Continue
    val listOne = arrayOf(1, 2, 3, null, 4, 5, null, 7, 8)
    var resultOne = 0
    for(i in listOne) {
        if (i == null)
            continue
        resultOne += i
    }
    println("Value resultOne = $resultOne")

    val listTwo = arrayOf(1, 2, 3, null, 4, 5, null, 7, 8)
    var resultTwo = 0
    for(i in listTwo) {
        if (i == null)
            break
        resultTwo += i
    }
    println("Value resultTwo = $resultTwo")
}