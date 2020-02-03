package module05

// Model 1 Import
/*import module05.sampleClassObject.mathematic.SumData
import module05.sampleClassObject.mathematic.calculator.MinusData
import module05.sampleClassObject.mathematic.calculator.PlusData*/

// Model 2 Import
import module05.sampleClassObject.mathematic.SumData
import module05.sampleClassObject.mathematic.calculator.*

fun main() {
    val list = arrayListOf(1, 2, 3, 4, 5)
    println(SumData(list)) // Call import module05.sampleClassObject.mathematic.SumData

    println(PlusData(5, 9))
    println(MinusData(7, 2))
}