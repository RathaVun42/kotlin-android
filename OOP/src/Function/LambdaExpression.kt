package Function

fun CalculateFee(transactionAmount: Double, fee: (fee: Double)-> Unit): Unit{
    when(transactionAmount){
        in 0.0..1000.0 ->{
            fee(0.0)
        }
        in 1000.1..5000.0 ->{
            fee(20.0)
        }
        in 5000.1..10000.0 ->{
            fee(50.0)
        }
        else -> {
            fee(100.0)
        }
    }
}

fun main(){
    val transactionAmount: Double = 10088.0
    var fee: Double = 0.0
    CalculateFee(transactionAmount){
        println(it)
    }
}