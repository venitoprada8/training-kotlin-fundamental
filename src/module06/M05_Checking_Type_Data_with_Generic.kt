package module06

fun main() {
    val list = ArrayList<Any>()
    list.add("Kelvin")
    list.add(23)

    /**TODO: Method 1 -> Using class 'DefineTypeGeneric' **/
    DefineTypeGeneric<String>().checkType(list[0]) // work
    DefineTypeGeneric<String>().checkType(list[1]) // work

    /**TODO: Method 2 -> Using function inline 'checkType' **/
    checkType<String>(list[0])

    functionGeneric<String>(list[0])
}

class DefineTypeGeneric<T>(private val classGeneric: Class<T>) {
    companion object {
        inline operator fun <reified T>invoke() = DefineTypeGeneric(T::class.java)
    }
    fun checkType(t: Any) {
        when {
            classGeneric.isAssignableFrom(t.javaClass) -> println("Correct Type")
            else -> println("Wrong Type")
        }
    }
}

inline fun <reified T> functionGeneric(t: Any) {
    DefineTypeGeneric<T>().checkType(t)
}

inline fun <reified T> checkType(t: Any) = checkType(T::class.java, t)
fun <T> checkType(target: Class<T>, t: Any) {
    when {
        target.isAssignableFrom(t::class.java) -> println("Correct")
        else -> println("Wrong")
    }
}