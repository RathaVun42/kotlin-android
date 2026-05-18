package Function


/**
 * In Kotlin, an inline function is a function marked with the inline keyword.
 * When you use it, the compiler copies the function’s code directly into the place where it is called,
 * instead of making a normal function call.
 *
 * inline function can be used only in high order function
 */
inline fun Sum(a: Int, b: Int, result: (Int) -> Unit){
    val result = a + b
    result(result)
}

fun main(){
    Sum(1,3){
        println(it)
    }
}