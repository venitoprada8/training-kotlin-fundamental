package module03

fun main() {
    //TODO: Menyalin dan Memodifikasi Data Class
    var student = DataStudent("Kelvin", "XII A", 'L')
    println("---------------------")
    println("Value Class Student :")
    println("Name : ${student.name}")
    println("Class : ${student.classStudent}")
    println("Gender : ${student.gender}")
    student = DataStudent("Fenny", "XI S", 'P')
    println("---------------------")
    println("Value Class Student :")
    println("Name : ${student.name}")
    println("Class : ${student.classStudent}")
    println("Gender : ${student.gender}")
    student = DataStudent("Siska", "X A", 'P')
    println("---------------------")
    println("Value Class Student :")
    println("Name : ${student.name}")
    println("Class : ${student.classStudent}")
    println("Gender : ${student.gender}")
    val studentTwo = student.copy()
    println("---------------------")
    println("Value Class Student :")
    println("Name : ${studentTwo.name}")
    println("Class : ${studentTwo.classStudent}")
    println("Gender : ${studentTwo.gender}")
}