package module04

class Data(val key: Int, val programming: String)
fun main() {
    val dataNumber = listOf(1, 2, 3, 4, 5)
    val dataNumber02 = listOf(5, 10, 15, 20, 25, 30, 35, 40, 45, 50)
    val dataNumber03 = listOf(1,1,2,3,4,4,5,4,6,6,6,7,6,8,7,6,9,10)

    //TODO: Fold
    println("----FOLD----")
    val foldLambda = dataNumber.fold(10) { data, item ->
        println("Call item $item, Value Data = $data")
        data + item
    }
    println("Out Fold = $foldLambda")
    println()

    //TODO: FoldRight
    println("----FOLD RIGHT----")
    val foldRightLambda = dataNumber.foldRight(10) { data, item ->
        println("Call item $item, Value Data = $data")
        data + item
    }
    println("Out Fold Right = $foldRightLambda")
    println()

    //TODO: Drop, DropLast, DropWhile, DropLastWhile
    println("----DROP----")
    val dropLambda = dataNumber.drop(2)
    val dropLastLambda = dataNumber.dropLast(2)
    val dropWhileLambda = dataNumber.dropWhile { it < 4 }
    val dropLastWhileLambda = dataNumber.dropLastWhile { data -> data >= 4 }
    println("Drop Lambda = $dropLambda")
    println("Drop Right Lambda = $dropLastLambda")
    println("Drop While Lambda = $dropWhileLambda")
    println("Drop Last While Lambda = $dropLastWhileLambda")
    println()

    //TODO: Take
    println("----TAKE----")
    val takeLambda = dataNumber.take(2)
    val takeLastLambda = dataNumber.takeLast(2)
    val takeWhileLambda = dataNumber.takeWhile { it < 4 }
    val takeLastWhileLambda = dataNumber.takeLastWhile { data -> data >= 4 }
    println("take Lambda = $takeLambda")
    println("take Right Lambda = $takeLastLambda")
    println("take While Lambda = $takeWhileLambda")
    println("take Last While Lambda = $takeLastWhileLambda")
    println()

    //TODO: Slice
    println("----SLICE----")
    val sliceLambda = dataNumber02.slice(4..8)
    val sliceLambdaTwo = dataNumber02.slice(4..8 step 2)
    val index = listOf(2, 3, 6, 8, 9)
    val sliceLambdaThree = dataNumber02.slice(index)
    println("Slice Version 1 = $sliceLambda")
    println("Slice Version 2 = $sliceLambdaTwo")
    println("Slice Version 3 = $sliceLambdaThree")
    println()

    //TODO: Distinct
    println("----DISTINCT----")
    val distinctVersionOne = dataNumber03.distinct()
    println(distinctVersionOne)

    val itemData = listOf(
        Data(1, "Kotlin"),
        Data(2, "Java"),
        Data(2, "Python"),
        Data(3, "C++")
    )
    val distinctVersionTwo = itemData.distinctBy { it.key }
    distinctVersionTwo.forEach { data ->
        println("${data.key} -> ${data.programming}")
    }
    println()

    //TODO: Chunked
    println("----CHUNKED----")
    val message = "KOTLIN"
    println("Chunked Version One = ${message.chunked(3)}")
    val messageTransform = message.chunked(3) {
        it.toString().toLowerCase()
    }
    println("Chunked Version Two = $messageTransform")

}