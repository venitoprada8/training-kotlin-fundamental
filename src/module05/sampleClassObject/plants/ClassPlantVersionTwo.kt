package module05.sampleClassObject.plants

class ClassPlantVersionTwo {
    private val kingdom = "Plantae"
    var classification = ""
    var filum = ""
    var name = ""
        get(){
            println("2. You call getter")
            return field
        }
        set(value) {
            println("1. You call setter")
            field = value
        }

    fun welcomePlant() {
        println("Welcome in Class Plant Version One")
    }

    fun messagePlant(): String = "Happy Coding with ClassPlantVersionOne"

    fun setNameKingdom(): String = kingdom
}