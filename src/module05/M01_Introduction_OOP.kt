package module05

import module05.sampleClassObject.ClassDataVersionTwo // --> To call ClassDataVersionTwo Class in package 'sampleClassObject'

fun main() {
    //TODO: Intorduction OOP

    /** OOP in local **/
    val classData01 = ClassDataVersionOne() // --> classData01 = object for ClassDataVersionOne Class
    classData01.getData()

    /** OOP in package **/
    val classData02 = ClassDataVersionTwo() // --> classData02 = object for ClassDataVersionTwo Class
    classData02.getData()
}

class ClassDataVersionOne {
    fun getData() {
        println("This is class data version 1")
    }
}