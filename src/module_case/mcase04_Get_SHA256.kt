package module_case

import java.lang.StringBuilder
import java.math.BigInteger
import java.security.MessageDigest
import java.util.*
import javax.crypto.Mac
import javax.crypto.spec.SecretKeySpec

fun main() {
    val input = "hello world"
    println(hashSHA256(input)) // b94d27b9934d3e08a52e52d7da7dabfac484efe37a5380ee9088f7ace2efcde9
    println(hashSHA256WithSecretKey(input, "w56kbwxuxh3heka3"))
}

fun hashSHA256(input: String): String {
    val md = MessageDigest.getInstance("SHA-256")
    val messageDigest = md.digest(input.toByteArray()) // digest() method called, to calculate message digest of an input, and return array of byte
    val no = BigInteger(1, messageDigest) // Convert byte array into signum representation
    var hashText = no.toString(16) // Convert message digest into hex value
    while (hashText.length < 32) {
        hashText = "0$hashText"
    }
    return hashText
}

fun hashSHA256WithSecretKey(input: String, secret: String): String {
    fun toHexString(bytes: ByteArray): String {
        val stringBuilder = StringBuilder(bytes.size * 2)
        val f = Formatter(stringBuilder)
        for (b in bytes) {
            f.format("%02x", b)
        }
        return stringBuilder.toString()
    }
    val secretKey = SecretKeySpec(secret.toByteArray(), "HmacSHA256")
    val mac = Mac.getInstance(secretKey.algorithm)
    mac.init(secretKey)
    val hMac = mac.doFinal(input.toByteArray())
    return toHexString(hMac)
}