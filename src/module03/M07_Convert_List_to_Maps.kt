package module03

fun main() {
    val numbers = listOf("one", "two", "three", "four")

    //TODO: Convert to List<Pair<Int,String>
    val numbersMaps = (0 until numbers.size).map {
        it+1 to numbers[it]
    }
    println(numbersMaps)

    //TODO: Convert to Map<Int, String>
    val numberMap02 = numbers.mapIndexed { index: Int, s: String -> index + 1 to s }.toMap()
    println(numberMap02)
}
