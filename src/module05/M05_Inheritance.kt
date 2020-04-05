package module05

open class PeopleClasses(val namePeople: String, val agePeople: Int, val genderPeople: Char) {
    open fun getName() {
        println("You input name = $namePeople")
    }

    open fun getAge() {
        println("Age = $agePeople")
    }

    open fun getGender() {
        println("Gender = $genderPeople")
    }
}

class MenPeople(name: String, age: Int, gender: Char): PeopleClasses(name, age, gender) {
    fun getCharacterMen() {
        println("Strong, Handsome")
    }
}

class WomenPeople(name: String, age: Int, gender: Char): PeopleClasses(name, age, gender) {
    fun getCharacterWomen() {
        println("Kind, Sweet, Pretty")
    }
}

fun main() {
    val People01 = MenPeople("Yoga", 20, 'L')
    val People02 = WomenPeople("Brigitta", 18, 'P')

    println("People1")
    println(People01.getName())
    println(People01.getAge())
    println(People01.getGender())
    println(People01.getCharacterMen())
    println()

    println("People2")
    println(People02.getName())
    println(People02.getAge())
    println(People02.getGender())
    println(People02.getCharacterWomen())
}