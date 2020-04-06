package module03

data class Data(val date: String, val age: Int)

fun main() {
    val arrayOne = ArrayList<Data>()
    arrayOne.add(Data("2020-1-22", 23))
    arrayOne.add(Data("2020-1-24", 24))

    val arrayTwo = ArrayList<Data>()
    arrayTwo.add(Data("2020-1-22", 34))
    arrayTwo.add(Data("2020-1-22", 72))

    val dataMaps = mapOf(
        "John" to arrayOne,
        "Bob" to arrayTwo
    )
    println("Key : $dataMaps")
}