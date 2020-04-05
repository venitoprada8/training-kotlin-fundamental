package module05.sampleClassObject.plants

class ClassPlantVersionFour(pName: String, pFilum: String? = null, pClassification: String? = null) {
    var classification: String? = "default"
    var filum: String? = "default"
    var name = "default"
    var nameClass = "default"

    init {
        classification = pClassification
        filum = pFilum
        name = pName
    }

    constructor(name: String, filum: String, classification: String, nameClass: String) : this(name, filum, classification) {
        this.nameClass = nameClass
    }
}