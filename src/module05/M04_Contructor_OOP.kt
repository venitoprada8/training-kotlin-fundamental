package module05

import module05.sampleClassObject.animals.ClassAnimalVersionFour
import module05.sampleClassObject.animals.ClassAnimalVersionThree
import module05.sampleClassObject.plants.ClassPlantVersionFour
import module05.sampleClassObject.plants.ClassPlantVersionThree

fun main() {
    //TODO: Default Constructor [ You can back to M01 - M03 ]
    /*val classPlant = ClassPlantVersionTwo()
    val classAnimal = ClassAnimalVersionTwo()*/

    //TODO: Primary Constructor Model 1
    val classAnimal = ClassAnimalVersionThree("Animalia", "Vertebrata", "Mamalia", "Horse")
    println(classAnimal.setNameKingdom())
    classAnimal.welcomeAnimal()
    println(classAnimal.messageAnimal())
    println(classAnimal.name)
    println(classAnimal.classification)
    println(classAnimal.filum)
    println()

    //TODO: Primary Constructor Model 2
    val classPlant = ClassPlantVersionThree("Plantae", "Spermatophyta", "Angiospermae", "Mango")
    println(classPlant.setNameKingdom())
    classPlant.welcomePlant()
    println(classPlant.messagePlant())
    println(classPlant.name)
    println(classPlant.classification)
    println(classPlant.filum)
    println()

    //TODO: Primary Constructor Model 3
    val classAnimalTwo = ClassAnimalVersionFour("Animalia", "Vertebrata", "Mamalia", "Buffalo")
    println(classAnimalTwo.kingdom)
    classAnimalTwo.welcomeAnimal()
    println(classAnimalTwo.messageAnimal())
    println(classAnimalTwo.name)
    println(classAnimalTwo.classification)
    println(classAnimalTwo.filum)
    println()

    //TODO: Secondary Constructor Model 1
    val classPlantPinus = ClassPlantVersionFour("Pinus", "Gymnospernae", "Spermatophyta", "Coniferinae Coniferales")
    val classPlantMangga = ClassPlantVersionFour("Mangga", "Angiospermae", "Spermatophyta")
    println("Pinus = ${classPlantPinus.name}, ${classPlantPinus.filum}, ${classPlantPinus.classification}, ${classPlantPinus.nameClass}")
    println("Mangga = ${classPlantMangga.name}, ${classPlantMangga.filum}, ${classPlantMangga.classification}, ${classPlantMangga.nameClass}")

    //TODO: Secondary Constructor Model 2
    val classPlantApple = ClassPlantVersionFour("Apple", "Gymnospermae")
    val classPlantOrange = ClassPlantVersionFour(pClassification = "Spermatophyta", pName = "Orange")
    println("Apple = ${classPlantApple.name}, ${classPlantApple.filum}")
    println("Orange = ${classPlantOrange.name}, ${classPlantOrange.classification}")
}