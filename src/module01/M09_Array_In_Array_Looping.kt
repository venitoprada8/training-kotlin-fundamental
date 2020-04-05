package module01

import java.util.ArrayList

data class DataArrayInArray02(
    val no: Int? = null,
    val dataArray: ArrayList<Int>
)

fun main() {
    val dataArrayInArray = (1..4).map { i ->
        val innerListSize = (0..10).random()
        val innerList = (0..innerListSize).map { (1..1000).random() }
        DataArrayInArray02(i, innerList as ArrayList<Int>)
    }
    for (j in 0 until dataArrayInArray.size) {
        println("ID : ${dataArrayInArray[j].no}, Data : ${dataArrayInArray[j].dataArray}")
    }
}