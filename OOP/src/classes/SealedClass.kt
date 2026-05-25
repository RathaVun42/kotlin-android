package classes

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread

data class Data(val name: String, val age: Int)
sealed class ApiResponse(){
    open fun showMessage(message:String){
        println(message)
    }
    data class Success(
        val data: Data,
        val message: String,
    ) : ApiResponse(){
        fun showData(){
            println(data.name)
            println(data.age)
        }
    }
    data class Error(
        val message: String,
    ): ApiResponse(){

    }
    object Loading: ApiResponse()
}
fun apiResult(result: ApiResponse){
    when(result){
        is ApiResponse.Success -> {
            result.showMessage(result.message)
            result.showData()
        }
        is ApiResponse.Error -> {
            result.showMessage(result.message)
        }
        is ApiResponse.Loading -> {
            println("Loading...")
        }
    }
}

fun main() = runBlocking{
    //apiResult(result = ApiResponse.Error("Error"))

    apiResult(ApiResponse.Loading)
    delay(3000)

    apiResult(result = ApiResponse.Success(message = "Success", data =  Data("Ratha",12)))
}

