package module01
import java.util.ArrayList

data class DataArrayInArray(
    val no: Int? = null,
    val dataArray: ArrayList<Int>
)

fun main() {
    val dataArrayInArray = ArrayList<DataArrayInArray>()
    val dataChildrenArray = ArrayList<Int>()

    dataChildrenArray.add(3)
    dataChildrenArray.add(4)
    dataChildrenArray.add(1)
    dataArrayInArray.add(DataArrayInArray(1, dataChildrenArray))
    println("ID : ${dataArrayInArray[0].no}, Data : ${dataArrayInArray[0].dataArray}")

    dataChildrenArray.clear()
    dataChildrenArray.add(6)
    dataChildrenArray.add(4)
    dataChildrenArray.add(9)
    dataChildrenArray.add(2)
    dataChildrenArray.add(7)
    dataArrayInArray.add(DataArrayInArray(2, dataChildrenArray))
    println("ID : ${dataArrayInArray[1].no}, Data : ${dataArrayInArray[1].dataArray}")
    dataChildrenArray.clear()

    dataChildrenArray.add(92)
    dataChildrenArray.add(21)
    dataChildrenArray.add(72)
    dataArrayInArray.add(DataArrayInArray(3, dataChildrenArray))
    println("ID : ${dataArrayInArray[2].no}, Data : ${dataArrayInArray[2].dataArray}")
    dataChildrenArray.clear()
}