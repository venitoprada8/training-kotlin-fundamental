package module_case

data class Dummy(val group: String, val memberGroup: String, val statusGroup: Boolean)

fun getDummy(): ArrayList<Dummy> {
    val dataDummy = ArrayList<Dummy>()

    dataDummy.add(Dummy("Programming Language", "Java", true))
    dataDummy.add(Dummy("Programming Language", "Kotlin", true))
    dataDummy.add(Dummy("Programming Language", "Apple", false))
    dataDummy.add(Dummy("Programming Language", "MacBook", false))
    dataDummy.add(Dummy("Programming Language", "Swift", true))

    dataDummy.add(Dummy("Fruits", "Java", false))
    dataDummy.add(Dummy("Fruits", "Kotlin", false))
    dataDummy.add(Dummy("Fruits", "Apple", true))

    dataDummy.add(Dummy("Laptop", "Java", false))
    dataDummy.add(Dummy("Laptop", "Kotlin", false))

    dataDummy.add(Dummy("Animal", "Cow", true))
    dataDummy.add(Dummy("Animal", "Mango", false))
    dataDummy.add(Dummy("Animal", "Dog", true))
    dataDummy.add(Dummy("Animal", "Cat", true))

    return dataDummy
}

fun main() {
    val dataDummy = getDummy()
    val mapList = HashMap<String, List<Dummy>>()
    var title = dataDummy[0].group
    var xChildStart = 0
    var xChildFinish = 0
    var x = 0
    dataDummy.forEach {
        if (title != it.group) {
            if (x == 0) {
                title = it.group
            }
            else {
                mapList[title] = (xChildStart until xChildFinish).map { i -> dataDummy[i] }
                title = it.group
                xChildStart = xChildFinish
            }
        }
        else if (x == dataDummy.size-1) mapList[title] = (xChildStart..xChildFinish).map { i -> dataDummy[i] }
        xChildFinish++
        x++
    }

    val keyList = ArrayList(mapList.keys)
    val valueList = ArrayList(mapList.values)
    for (i in 0 until keyList.size) {
        println("${keyList[i]} <-> ${valueList[i]}")
    }

    //valueList
    println()
    for (x in 0 until valueList.size) {
        for (y in 0 until valueList[x].size) {
            print(valueList[x][y].memberGroup+" ")
        }
        println()
    }
}