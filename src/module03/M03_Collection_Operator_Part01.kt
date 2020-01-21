package module03

data class User(val name: String, val age: Int)
data class People(val name: String, val age: Int)

fun main() {
    //TODO: List
    val listOne = listOf(1, 2, 3, 4, 5) // list Integer
    println("------------------------")
    println("listOne[0] = ${listOne[0]}")
    println("listOne[1] = ${listOne[1]}")
    println("listOne[2] = ${listOne[2]}")

    val listTwo = listOf(1.1, 2.2, 3.3, 4.4, 5.5) // list Double
    println("------------------------")
    println("listTwo[0] = ${listTwo[0]}")
    println("listTwo[1] = ${listTwo[1]}")
    println("listTwo[2] = ${listTwo[2]}")

    val listThree = listOf('a', 'b', 'c', 'd', 'e') // list Char
    println("------------------------")
    println("listThree[0] = ${listThree[0]}")
    println("listThree[1] = ${listThree[1]}")
    println("listThree[2] = ${listThree[2]}")

    val listFour = listOf("Java", "Kotlin", "Python") // list String
    println("------------------------")
    println("listFour[0] = ${listFour[0]}")
    println("listFour[1] = ${listFour[1]}")
    println("listFour[2] = ${listFour[2]}")

    val listFive = listOf(User("Kelvin", 23), People("Ayu", 18)) // list Data Class
    println("------------------------")
    println("listFive[0] = ${(listFive[0] as User).name}")
    println("listFive[1] = ${(listFive[1] as People).name}")

    //TODO: mutableListOf --> can change value
    println("------------------------")
    val anyList = mutableListOf(1, 2.2, true, 'a', User("Kelvin", 23))
    println("${anyList[0]} ${anyList[1]} ${anyList[2]} ${anyList[3]} ${anyList[4]}")
    anyList.add(234)
    println("${anyList[0]} ${anyList[1]} ${anyList[2]} ${anyList[3]} ${anyList[4]} ${anyList[5]}")
    anyList.add(1, "Kotlin")
    println("${anyList[0]} ${anyList[1]} ${anyList[2]} ${anyList[3]} ${anyList[4]} ${anyList[5]} ${anyList[6]}")
    anyList.removeAt(3)
    println("${anyList[0]} ${anyList[1]} ${anyList[2]} ${anyList[3]} ${anyList[4]} ${anyList[5]}")
    anyList.remove(User("Kelvin", 23))
    println("${anyList[0]} ${anyList[1]} ${anyList[2]} ${anyList[3]} ${anyList[4]}")

    //TODO: Set && mutableSet
    println("------------------------")
    val setS = setOf(1, 2, 3, 4, 3, 5, 8, 6, 7, 10, 8, 9, 10)
    val setA = setOf(2, 3, 5, 4, 3, 6, 2)
    val setB = setOf(1, 2, 1, 4, 6, 2, 3)
    println("S = $setS") // Data S
    println("A = $setA") // Data A
    println("B = $setB") // Data B
    println("A union B = ${setA.union(setB)}")
    println("A intersection B = ${setA.intersect(setB)}")

    println("------------------------")
    val setC = mutableSetOf(1, 2, 3, 4, 5)
    setC.add(6)
    println(setC)
    setC.add(4)
    println(setC)
    setC.remove(2)
    println(setC)

    //TODO: Maps && toMutableMap
    val indonesian = mapOf(
        "JawaTengah" to "Semarang",
        "JawaTimur" to "Surabaya",
        "JawaBarat" to "Bandung"
    )
    println("------------------------")
    println("Key : ${indonesian.keys}")
    println("Values : ${indonesian.values}")
    println("Value JawaTengah = ${indonesian["JawaTengah"]}")
    println("Value JawaTengah = ${indonesian.getValue("JawaTengah")}")

    val indonesianMutableMap = indonesian.toMutableMap()
    indonesianMutableMap["DKI Jakarta"] = "Jakarta"
    println("Values : ${indonesianMutableMap.values}")
    indonesianMutableMap.remove("JawaTimur")
    println("Values : ${indonesianMutableMap.values}")
}