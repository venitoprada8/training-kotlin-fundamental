package module03

class Student(val name: String, val classStudent: String, val gender: Char) // TODO: Class Type
data class DataStudent(val name: String, val classStudent: String, val gender: Char) //TODO: Data Class Type

fun main() {
    val student = Student("Kelvin", "XII A", 'L')
    val studentTwo = Student("Kelvin", "XII A", 'L')
    val dataStudent = DataStudent("Kelvin", "XII A", 'L')
    val dataStudentTwo = DataStudent("Kelvin", "XII A", 'L')

    //TODO: For Class Type
    println("---------------------")
    println("Value Class Student : $student")
    println("Name : ${student.name}")
    println("Class : ${student.classStudent}")
    println("Gender : ${student.gender}")
    println("Value Class StudentTwo : $studentTwo")
    println("Name : ${studentTwo.name}")
    println("Class : ${studentTwo.classStudent}")
    println("Gender : ${studentTwo.gender}")
    println("Value = ${student == studentTwo}")

    //TODO: For Data Class Type
    println("---------------------")
    println("Value Data Class Student : $dataStudent")
    println("Name : ${dataStudent.name}")
    println("Class : ${dataStudent.classStudent}")
    println("Gender : ${dataStudent.gender}")
    println("Value Data Class Student : $dataStudentTwo")
    println("Name : ${dataStudentTwo.name}")
    println("Class : ${dataStudentTwo.classStudent}")
    println("Gender : ${dataStudentTwo.gender}")
    println("Value = ${dataStudent == dataStudentTwo}")
}