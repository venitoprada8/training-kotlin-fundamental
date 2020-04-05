package module04

fun main() {
    //TODO: Function General
    functionGeneral()

    //TODO: Function References
    println(functionReferences())

    //TODO: Function Inside Function
    functionInsideFunction("Kotlin")
}

fun functionGeneral() {
    println("Learning Kotlin Fundamental")
}

fun functionReferences(): String = "Learning Kotlin Fundamental"

fun functionInsideFunction(data: String) {
    var sample = ""

    // This is inner function
    fun setDataSample(dataSet: String) = dataSet
    fun getDataSample() {
        println("$sample Fundamental")
    }

    sample = setDataSample(data)
    getDataSample()
}