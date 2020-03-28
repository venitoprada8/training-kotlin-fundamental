package module01

import java.util.ArrayList

data class DataArrayInArray02(
    val no: Int? = null,
    val dataArray: ArrayList<Int>
)

fun main() {
    val dataArrayInArray = ArrayList<DataArrayInArray02>()
    val dataChildrenArray = ArrayList<Int>()

    for (i in 0..5) {
        val data = (0..50).random()
        for (j in 0..data) {
            val d = (1..1000).random()
            dataChildrenArray.add(d)
        }
        dataArrayInArray.add(DataArrayInArray02(i+1, dataChildrenArray))
        println("ID : ${dataArrayInArray[i].no}, Data : ${dataArrayInArray[i].dataArray}")
        dataChildrenArray.clear()
    }
}