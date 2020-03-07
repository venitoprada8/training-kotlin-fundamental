package module01

fun main() {
    // TODO: Data Type Part 02
    val a = 'A' // Character -> char
    val b = "Kelvin" // String
    println("The value of 'a' is $a")
    println("The value of 'b' is $b")
    println("--------------------------------------")

    // TODO: Operator Convert to Data Type [ String -> Number Type ]
    val c = "18.123456789" // String
    val d = 18.12345 // Double
    val e = 18 // Int
    val f = "18"
    val fInt: Int = f.toInt()
    val cDouble: Double = c.toDouble()
    val cFloat: Float = c.toFloat()
    val eLong: Long = e.toLong()
    val eShort: Short = e.toShort()
    val eByte: Byte = e.toByte()
    val dString: String = d.toString()
    println("The value of 'cInt' is $fInt")
    println("The value of 'cDouble' is $cDouble")
    println("The value of 'cFloat' is $cFloat")
    println("The value of 'cLong' is $eLong")
    println("The value of 'cShort' is $eShort")
    println("The value of 'cByte' is $eByte")
    println("The value of 'dString' is $dString")
    println("--------------------------------------")

    // TODO: Boolean Operator --> Conjunction or AND
    var w = true && true
    var x = true && false
    var y = false && true
    var z = false && false
    println("The value of 'w' is $w")
    println("The value of 'x' is $x")
    println("The value of 'y' is $y")
    println("The value of 'z' is $z")
    println("--------------------------------------")

    // TODO: Boolean Operator --> Disjunction or OR
    w = true || true
    x = true || false
    y = false || true
    z = false || false
    println("The value of 'w' is $w")
    println("The value of 'x' is $x")
    println("The value of 'y' is $y")
    println("The value of 'z' is $z")
    println("--------------------------------------")

    // TODO: Boolean Operator --> Negation or NOT
    x = !true
    y = !false
    println("The value of 'x' is $x")
    println("The value of 'y' is $y")
    println("--------------------------------------")
}