package classes

open class Loan(){
    lateinit var loanId: String
    protected var amount: Double = 0.0
    private var date =""

    fun setDate(date:String){
        this.date = date
    }
    fun getDate():String{
        return date
    }
}

class CarLoan : Loan(){
    /**
     * in subclass, we cannot reassign the protected properties,
     * but we can reassign them in function in that class.
     *
     * one more when we declare a property as protected, it will automatically create setter and getter for that property
     * Ex. protected var name = "" (setName(name: String) and getName() are created)
     * so if we try to create other setter and getter that named setName or getName in subclass, it will be error
     */
    fun updateAmount(amount: Double){
        this.amount = amount
    }
    fun getUpdatedAmount():String{
        return this.amount.toString()
    }


}

fun main() {
    val loan = Loan()
    loan.loanId = "0978978"
    loan.setDate("2020")
    println(loan.loanId)
    println(loan.getDate())

    println("-----")
    val carLoan = CarLoan()
    carLoan.updateAmount(110.0)
    carLoan.setDate("2026")
    carLoan.loanId = "00000123"
    println("Loan Id: ${carLoan.loanId} \n" +
            "Loan amount: ${carLoan.getUpdatedAmount()} \n" +
            "Loan date: ${carLoan.getDate()} \n"
    )

    val carLoan2 = CarLoan()
    carLoan2.loanId = "00000098"
    carLoan2.setDate("2020")
    carLoan2.updateAmount(230.0)

    println("Loan Id: ${carLoan2.loanId} \n" +
            "Loan amount: ${carLoan2.getUpdatedAmount()} \n" +
            "Loan date: ${carLoan2.getDate()} \n"
    )
}