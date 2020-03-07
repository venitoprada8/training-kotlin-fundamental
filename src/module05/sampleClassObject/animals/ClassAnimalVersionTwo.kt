package module05.sampleClassObject.animals

class ClassAnimalVersionTwo {
    private val kingdom = "Animalia" // Property Kingdom
    var classification = "" // Property Classification
    var filum = "" // Property Filum
    var name = "" // Property Name
        get(){
            println("2. You call getter")
            return field
        }
        set(value) {
            println("1. You call setter")
            field = value
        }

    fun welcomeAnimal() {
        println("Welcome in Class Animal Version One")
    }

    fun messageAnimal(): String = "Happy Coding with ClassAnimalVersionOne"

    fun setNameKingdom(): String = kingdom
}