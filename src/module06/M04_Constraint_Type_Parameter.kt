package module06

fun main() {
    val dataNumber = listOf(1, 2, 3, 4, 5)
    dataNumber.sumNumberData()

    val dataString = listOf("Kotlin", "Java")
//    dataString.sumNumberData() --> error

    val amountData = AmountData<String>()
    println(amountData.getSizeData(dataString))
}

fun <T: Int> List<T>.sumNumberData() {
    val sum = this.sum()
    println("Sum = $sum")
}

class AmountData<T: String> {
    fun getSizeData(list: List<T>) = list.size
}