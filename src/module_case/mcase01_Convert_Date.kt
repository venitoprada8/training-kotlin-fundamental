package module_case

import java.util.TimeZone
import java.util.Locale
import java.text.SimpleDateFormat

fun main() {
    //TODO: Case Time in GMT
    val dateStr = "Jul 16, 2013 12:08:59 AM"
    val df = SimpleDateFormat("MMM dd, yyyy HH:mm:ss a", Locale.ENGLISH)
    df.timeZone = TimeZone.getTimeZone("UTC")
    val date = df.parse(dateStr)
    df.timeZone = TimeZone.getDefault()
    val formattedDate = df.format(date)
    println(dateStr)
    println("convert")
    println(formattedDate)
}