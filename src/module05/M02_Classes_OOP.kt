package module05

import module05.sampleClassObject.animals.ClassAnimalVersionOne
import module05.sampleClassObject.plants.ClassPlantVersionOne

fun main() {
    val classPlant = ClassPlantVersionOne()
    val classAnimal = ClassAnimalVersionOne()

    classPlant.welcomePlant()
    println(classPlant.messagePlant())

    classAnimal.welcomeAnimal()
    println(classAnimal.messageAnimal())
}