package module06

class KamenRider(val name: String? = null, val yearStart: Int? = null, val yearFinish: Int? = null)
class Ultraman(val name: String, val year: Int)

fun main() {
    //TODO: Model 1
    val kamenRider = KamenRider("Kuuga", 2000, 2001)
    val ultraman = Ultraman("Gaia", 2003)
    genericData(kamenRider)
    println()
    genericData(ultraman)

    //TODO: Model 2
    println()
    genericDataTwo<KamenRider>()
    genericDataTwo<Ultraman>()
}

fun <T> genericData(data: T?) {
    val dataGeneric: T? = data
    when(dataGeneric) {
        is KamenRider -> {
            println("You are using Kamen Rider Model")
            println("Name        : ${dataGeneric.name}")
            println("Year Start  : ${dataGeneric.yearStart}")
            println("Year Finish : ${dataGeneric.yearFinish}")
        }
        is Ultraman -> {
            println("You are using Ultraman Model")
            println("Name : ${dataGeneric.name}")
            println("Year : ${dataGeneric.year}")
        }
    }
}

inline fun <reified T> genericDataTwo() {
    when(T::class) {
        KamenRider::class -> {
            val dataGeneric = KamenRider("Kuuga", 2000, 2001)
            println("You are using Kamen Rider Model")
            println("Name        : ${dataGeneric.name}")
            println("Year Start  : ${dataGeneric.yearStart}")
            println("Year Finish : ${dataGeneric.yearFinish}")
        }
        Ultraman::class -> {
            val dataGeneric = Ultraman("Gaia", 2003)
            println("You are using Ultraman Model")
            println("Name : ${dataGeneric.name}")
            println("Year : ${dataGeneric.year}")
        }
    }
}