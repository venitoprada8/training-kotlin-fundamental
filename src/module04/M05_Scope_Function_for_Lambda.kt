package module04

fun main() {
    //TODO: Lambda Receiver [ run, with, apply ]
    //TODO: run
    val message01 = "Java"
    val runMessage = message01.run {
        val from = this
        val to = this.replace(this, "Kotlin")
        "Change from $from to $to"
    }
    println(runMessage)

    //TODO: with --> just function
    val message02 = "Kotlin is fun"
    val withMessage = with(message02) {
        println("In with : $this")
        this
    }
    println("Out with : $withMessage")

    //TODO: apply ( receiver )
    val message03 = "Kotlin"
    message03.apply {
        println("Apply : $this")
        val length = this.length
        println("Length data : $length")
    }

    //TODO: Lambda Argument [ let, also ]
    //TODO: let
    val message04 = "Kotlin"
    val letMessage = message04.let {
        it.length * 2
    }
    println("Length with let = $letMessage")

    //TODO: let for case value non-null
    val message05: String? = null
    val letNonNull = message05?.let {
        it.length
    }
    println("Length with let non-null = $letNonNull")

    //TODO: also
    val message06 = "Java Fundamental"
    val alsoMessage = message06.also {
        val message = it.replace("Java", "Kotlin")
        println("Also in : $message")
    }
    println("Also out : $alsoMessage")
}