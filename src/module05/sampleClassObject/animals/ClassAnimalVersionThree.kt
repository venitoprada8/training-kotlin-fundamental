package module05.sampleClassObject.animals

class ClassAnimalVersionThree(pKingdom: String, pClassification: String, pFilum: String, pName: String) {
    val kingdom: String
    val classification: String
    val filum: String
    val name: String

    init {
        kingdom = pKingdom
        classification = pClassification
        filum = pFilum
        name = pName
    }

    fun welcomeAnimal() {
        println("Welcome in Class Animal Version One")
    }

    fun messageAnimal(): String = "Happy Coding with ClassAnimalVersionOne"

    fun setNameKingdom(): String = kingdom
}