package module05

import module05.sampleClassObject.animals.ClassAnimalVersionTwo
import module05.sampleClassObject.plants.ClassPlantVersionTwo

fun main() {
    val classPlant = ClassPlantVersionTwo()
    val classAnimal = ClassAnimalVersionTwo()

    println(classPlant.setNameKingdom())
    classPlant.welcomePlant()
    println(classPlant.messagePlant())
    classPlant.name = "Mango"
    classPlant.classification = "Spermatophyta"
    classPlant.filum = "Angiospermae"
    println(classPlant.name) // Using getter and setter
    println(classPlant.classification)
    println(classPlant.filum)
    println()

    println(classAnimal.setNameKingdom())
    classAnimal.welcomeAnimal()
    println(classAnimal.messageAnimal())
    classAnimal.name = "Horse"
    classAnimal.classification = "vertebrata"
    classAnimal.filum = "Mamalia"
    println(classAnimal.name) // Using getter and setter
    println(classAnimal.classification)
    println(classAnimal.filum)
    println()
}