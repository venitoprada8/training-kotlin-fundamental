package module05.sampleClassObject.plants

class ClassPlantVersionThree(pKingdom: String, pClassification: String, pFilum: String, pName: String) {
    private val kingdom = pKingdom
    var classification = pClassification
    var filum = pFilum
    var name = pName

    fun welcomePlant() {
        println("Welcome in Class Plant Version One")
    }

    fun messagePlant(): String = "Happy Coding with ClassPlantVersionOne"

    fun setNameKingdom(): String = kingdom
}