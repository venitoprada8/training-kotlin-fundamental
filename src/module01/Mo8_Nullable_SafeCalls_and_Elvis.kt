package module01

fun main() {
    // TODO: Define variable null
    val data: String? = null // Nullable

    // TODO: SafeCalls
    println(data?.length) // Without '?', you will get error
    // println(data!!.length) // useful but not recommended, if you run, you will get error kotlin.KotlinNullPointerException

    // TODO: Elvis Operator
    println(data?.length ?: "The value is null")
}