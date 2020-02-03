package module05

open class ProProtected(protected val pro03: String)

class Programming(val pro01: String, private val pro02: String, pro03: String): ProProtected(pro03) {
    fun setPro02(): String = pro02
    fun setPro03(): String = pro03
}

fun main() {
    val programming = Programming("Python", "Java", "Kotlin")

    //TODO: public
    println(programming.pro01)

    //TODO: private
    println(programming.setPro02())

    //TODO: protected
    println(programming.setPro03())
}