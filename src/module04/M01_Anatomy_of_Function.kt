package module04

fun main() {
    //TODO: Function without parameter and with parameter
    getMessageWithoutParameter()
    getMessageWithParameter("I'm learning Kotlin Fundamental")
    println()

    //TODO: Function with return data
    val message = getMessageWithReturnDataString()
    println("This function using return data type String. Message : $message")
    val data = getDataWithReturnDataInteger()
    println("This function using return data type Integer. Data : $data")
    println()

    //TODO: Function type Public
    val dataClassPublic = getMessageTypePublic() // Public
    println(dataClassPublic)
    println()

    //TODO: Function type Private
    // val dataClassPrivate = getMessageTypePrivate() // Private --> you can'nt call it
    val dataClassPrivate = setMessagePrivate() // Call data using setMessagePrivate to get data from function getMessagePrivate
    println(dataClassPrivate)
    println()

    //TODO: Function Complete ( Having parameter, type data, and modifier )
    val dataComplete = setDataFunction("Kelvin")
    println(dataComplete)
}

fun getMessageWithoutParameter() {
    println("This is function without parameter")
}

fun getMessageWithParameter(message: String) {
    println("This is function with parameter. Message : $message")
}

fun getMessageWithReturnDataString(): String {
    return "I'm learning Kotlin Programming"
}

fun getDataWithReturnDataInteger() : Int = 12345

