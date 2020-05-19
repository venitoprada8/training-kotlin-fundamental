package module04

fun main() {
    //TODO: Named Argument
    println("NAMED ARGUMENT")
    getIdentity("Kelvin", 23, "Palmerah") // without named argument
    getIdentity(name = "Kelvin", age = 23, address = "Palmerah") // with named argument
    getIdentity(age = 23, address = "Palmerah", name = "Kelvin") // with named argument without look at from position
    println()

    //TODO: Default Argument
    println("DEFAULT ARGUMENT")
    getIdentityTwo() // You will get default value
    getIdentity("Ayu", 20, "Solo") // Change value
    println()

    //TODO: Vararg Argument
    println("VARARG ARGUMENT")
    getSumData(1, 2, 3, 4, 5)
    getAllData("Kotlin", "Java", "Python")
}

fun getIdentity(name: String, age: Int, address: String) {
    println("Name : $name \nAge : $age \nAddress : $address \n---------------------")
}

fun getIdentityTwo(name: String = "Kelvin", age: Int = 23, address: String = "Palmerah") {
    println("Name : $name \nAge : $age \nAddress : $address \n---------------------")
}

fun getSumData(vararg number: Int) {
    println("Sum data = ${number.sum()}")
}

fun getAllData(vararg data: String) {
    println("All data = ${data.size}")
    println("Data 1 = ${data[0]}")
    println("Data 2 = ${data[1]}")
    println("Data 3 = ${data[2]}")
}