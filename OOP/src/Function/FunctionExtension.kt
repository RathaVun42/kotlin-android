package Function

/**
 * Kotlin extensions let you extend a class or an interface with new functionality without using inheritance or design patterns.
 *
 * To create your own extension function, prefix its name with a receiver type followed by a . .
 * In this example, the .truncate() function extends the String class, so the receiver type is String:
 */
fun String.trucate(maxLength: Int): String {
    return if (this.length <= maxLength) this else this.take(this.length - 3) + "..."
}

fun main(){
    val longString = "hhhhhhhhhhhhh"
    val shortString = "12345"
    println(longString.length)
    println(longString.trucate(8))
    println(shortString.trucate(8))
}