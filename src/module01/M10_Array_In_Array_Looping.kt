package module01

import java.util.ArrayList

data class DataArrayInArray02(
    val no: Int? = null,
    val dataArray: ArrayList<Int>
)

fun main() {
    val dataArrayInArray = ArrayList<DataArrayInArray02>()
    val dataChildrenArray = ArrayList<Int>()

    dataChildrenArray.add(3)
    dataChildrenArray.add(4)
    dataChildrenArray.add(1)
    dataArrayInArray.add(DataArrayInArray02(1, dataChildrenArray))
    println("ID : ${dataArrayInArray[0].no}, Data : ${dataArrayInArray[0].dataArray}")
    dataChildrenArray.clear()
    dataChildrenArray.add(6)
    dataChildrenArray.add(4)
    dataChildrenArray.add(9)
    dataChildrenArray.add(2)
    dataChildrenArray.add(7)
    dataArrayInArray.add(DataArrayInArray02(2, dataChildrenArray))
    println("ID : ${dataArrayInArray[1].no}, Data : ${dataArrayInArray[1].dataArray}")
    dataChildrenArray.clear()
}