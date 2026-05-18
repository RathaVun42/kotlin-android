package classes

import Function.transactions

open class Account(
    val accountNumber: String,
    protected var balance: Double,
    private var isFreezed: Boolean,
){
    fun deposit(amount: Double){
        balance += amount
    }
    open fun withdraw(amount: Double){
        if(isFreezed){
            throw Exception("Account is frozen!")
        }
        if(amount > balance){
            throw Exception("Don't have enough balances")
        }
        balance -= amount
    }
    fun showBalance() = balance
    fun updateStatus(isFreezed: Boolean){
        this.isFreezed = isFreezed
    }
    fun showStatus() = isFreezed
}

class Saving(
    accountNumber: String,
    balance: Double,
    isFreezed: Boolean,
    private var interestRate: Double,
    private var year: Int
) : Account(accountNumber, balance, isFreezed) {
    var period = 5
    fun applyInterest() {
        val interest = balance * interestRate / 100
        deposit(interest)
    }
    override fun withdraw(amount: Double) {
        if(period < this.year){
            throw Exception("Saving acc doesn't allow to withdraw")
        }
        if(amount > balance){
            throw Exception("Don't have enough balances")
        }
        balance -= amount
    }
    fun getYear(): Int = year
}

fun main() {
    val acc = Account("00011", 1000.0, false)
    val savingAcc = Saving("00012", 1000.0, false, 5.0, 6)
    try {
        var period = savingAcc.period
        while (period > 0) {
            savingAcc.applyInterest()
            period -= 1
        }
        savingAcc.withdraw(100.0)
        println("%.2f $".format(savingAcc.showBalance()))
        println(savingAcc.getYear())
    }catch (e: Exception){
        println(e.message)
    }
}