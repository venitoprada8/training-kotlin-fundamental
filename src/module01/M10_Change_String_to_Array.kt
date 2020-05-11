package module01

fun main() {
    val data = "kotlin,python,java"
    val dataArray = ArrayList<String>()
    var x = 0; var y = 0
    data.forEach {
        if (it == ',') {
            dataArray.add(data.substring(x, y))
            x = y+1
        }
        else if (y == data.length-1) dataArray.add(data.substring(x, y+1))
        y++
    }
    println(dataArray)
}