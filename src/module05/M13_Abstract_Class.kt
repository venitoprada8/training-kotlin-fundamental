package module05

abstract class Person(name: String) {
    var message: String = "default"
    init {
        println("My name is $name.")
    }
    fun displaySSN(ssn: Int) {
        println("My SSN is $ssn.")
    }
    abstract fun displayJob(description: String)
    abstract fun setData(data: String)
}

class Teacher(name: String): Person(name) {
    override fun setData(data: String) {
        message = data
    }
    override fun displayJob(description: String) {
        println(description)
    }
}

fun main() {
    val teacher = Teacher("Kelvin")
    teacher.displayJob("I'm a physics teacher.")
    teacher.displaySSN(43214)
    println(teacher.message)
    teacher.setData("I can change message")
    println(teacher.message)
}