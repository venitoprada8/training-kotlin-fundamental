package module05

import kotlin.reflect.KProperty

class DelegateProperty {
    private var fruit: String = "Default"

    operator fun getValue(classRef: Any?, property: KProperty<*>) : String {
        return fruit
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: String){
        fruit = newValue
    }
}

class Juice {
    var type: String by DelegateProperty()
}

fun main() {
    val juice = Juice()
    juice.type = "Mango"
    println("${juice.type} Juice")
}