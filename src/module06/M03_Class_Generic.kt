package module06

import java.util.ArrayList

class Employee(val name: String, val id: Int)
class Teacher(val name: String, val study: String)

fun main() {
    //TODO: Employee
    val dataEmployee = ArrayList<Employee>()
    dataEmployee.add(Employee("Tina", 654))
    dataEmployee.add(Employee("Erick", 789))
    val employee = GenericClasses<Employee>()
    employee.setData(dataEmployee)
    println("List Employee")
    for (i in 0..(employee.getSizeData() ?: 0)) {
        println("${employee.dataClasses?.get(i)?.name} - ${employee.dataClasses?.get(i)?.id}")
    }
    println()

    //TODO: Teacher
    val dataTeacher = ArrayList<Teacher>()
    dataTeacher.add(Teacher("Tina", "Mathematics"))
    dataTeacher.add(Teacher("Erick", "Physics"))
    val teacher = GenericClasses<Teacher>()
    teacher.setData(dataTeacher)
    println("List Teacher")
    for (i in 0..(teacher.getSizeData() ?: 0)) {
        println("${teacher.dataClasses?.get(i)?.name} - ${teacher.dataClasses?.get(i)?.study}")
    }
    println()
}

class GenericClasses<T> {
    var dataClasses: ArrayList<T>? = null

    fun setData(data: ArrayList<T>) {
        dataClasses = data
    }

    fun getSizeData(): Int? = dataClasses?.size?.minus(1)
}