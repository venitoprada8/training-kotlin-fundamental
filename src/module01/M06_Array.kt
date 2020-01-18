package module01

fun main() {
    // TODO: Array Basic
    val arrayModel01 = arrayOf(1,2,3,4,5) // Array Integer
    val arrayModel02 = arrayOf(1.1, 1.45, 1.67, 23.4, 65.3) // Array Double
    val arrayModel03 = arrayOf(1, 2.3, 4.5f, 3L, "Kelvin", true) // Array Mix
    println("The value of arrayModel01[0] = ${arrayModel01[0]}")
    println("The value of arrayModel01[1] = ${arrayModel01[1]}")
    println("The value of arrayModel01[2] = ${arrayModel01[2]}")
    println("The value of arrayModel02[2] = ${arrayModel02[2]}")
    println("The value of arrayModel02[3] = ${arrayModel02[3]}")
    println("The value of arrayModel02[4] = ${arrayModel02[4]}")
    println("The value of arrayModel03[0] = ${arrayModel03[0]}")
    println("The value of arrayModel03[1] = ${arrayModel03[1]}")
    println("The value of arrayModel03[2] = ${arrayModel03[2]}")
    println("The value of arrayModel03[3] = ${arrayModel03[3]}")
    println("The value of arrayModel03[4] = ${arrayModel03[4]}")
    println("The value of arrayModel03[5] = ${arrayModel03[5]}")
    // Change Value
    arrayModel01[0] = 6
    arrayModel02[0] = 4.32
    println("The value of arrayModel01[0] = ${arrayModel01[0]}")
    println("The value of arrayModel02[0] = ${arrayModel02[0]}")
    println("--------------------------------------------------")

    // TODO: ArrayList Basic
    val arrayModel04 = ArrayList<Int>()
    val arrayModel05 = ArrayList<String>()
    arrayModel04.add(1)
    arrayModel04.add(2)
    arrayModel04.add(3)
    arrayModel05.add("Kotlin")
    arrayModel05.add("Java")
    arrayModel05.add("Python")
    println("The value of arrayModel04[0] = ${arrayModel04[0]}")
    println("The value of arrayModel04[1] = ${arrayModel04[1]}")
    println("The value of arrayModel04[2] = ${arrayModel04[2]}")
    println("The value of arrayModel05[0] = ${arrayModel05[0]}")
    println("The value of arrayModel05[1] = ${arrayModel05[1]}")
    println("The value of arrayModel05[2] = ${arrayModel05[2]}")
    println("--------------------------------------------------")

    // TODO: ArrayList in Kotlin
    val arrayModel06 = arrayListOf<Int>()
    val arrayModel07 = arrayListOf<String>()
    arrayModel06.add(1)
    arrayModel06.add(2)
    arrayModel06.add(3)
    arrayModel07.add("Kotlin")
    arrayModel07.add("Java")
    arrayModel07.add("Python")
    println("The value of arrayModel06[0] = ${arrayModel06[0]}")
    println("The value of arrayModel06[1] = ${arrayModel06[1]}")
    println("The value of arrayModel06[2] = ${arrayModel06[2]}")
    println("The value of arrayModel07[0] = ${arrayModel07[0]}")
    println("The value of arrayModel07[1] = ${arrayModel07[1]}")
    println("The value of arrayModel07[2] = ${arrayModel07[2]}")
}