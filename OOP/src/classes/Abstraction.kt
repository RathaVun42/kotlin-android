package classes

abstract class Laon(
    val Holder: String,
    val amount: Double,
    val totalMonth: Int
){
    abstract var interestRate: Double
    abstract fun calculateMonthlyInterest(): Double
    fun monthlyPayment(): Double{
        return (amount/totalMonth) + calculateMonthlyInterest()
    }
}

class HomeLaon(
    Holder: String,
    amount: Double,
    totalMonth: Int
) : Laon(Holder,amount,totalMonth){

    init {
        HomeLaon.totalInstantiation ++
    }
    override var interestRate: Double = 6.0
    override fun calculateMonthlyInterest(): Double {
        return amount * interestRate/100/12
    }
    companion object TotalInstantiation{
        var totalInstantiation = 0
    }
}

fun main() {
    val homeLaon = HomeLaon("Ratha",10000.0,24)
    println(String.format("%.2f", homeLaon.calculateMonthlyInterest() + homeLaon.amount / homeLaon.totalMonth))
    println(String.format("%.2f",homeLaon.monthlyPayment()))
    println(HomeLaon.totalInstantiation)
}