package module04

private fun getMessageTypePrivate() {
    println("You print this message type Private")
}

fun getMessageTypePublic() {
    println("You print this message type Public")
}

private fun getMessagePrivate() {
    println("You print this message type Private")
}

fun setMessagePrivate() {
    getMessagePrivate()
}

private fun getDataFunction(name: String): String {
    val dataName = name
    return "$dataName is learning Kotlin Programming"
}

fun setDataFunction(name: String): String {
    return getDataFunction(name)
}

fun main() {
    getMessageTypePrivate()
    getMessageTypePublic()
}