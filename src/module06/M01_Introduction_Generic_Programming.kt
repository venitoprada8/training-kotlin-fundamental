package module06

import java.util.ArrayList

class Student(val name: String, val id: Int)

fun main() {
    //TODO: Example : ArrayList
    val dataInt = ArrayList<Int>()
    dataInt.add(1)
    dataInt.add(2)
    println("${dataInt[0]} ${dataInt[1]}")

    val dataString = ArrayList<String>()
    dataString.add("Kotlin")
    dataString.add("Java")
    println("${dataString[0]} ${dataString[1]}")

    val dataModel = ArrayList<Student>()
    dataModel.add(Student("Alex", 123))
    dataModel.add(Student("Tiffany", 456))
    println("${dataModel[0].name} ${dataModel[0].id}")
    println("${dataModel[1].name} ${dataModel[1].id}")
}