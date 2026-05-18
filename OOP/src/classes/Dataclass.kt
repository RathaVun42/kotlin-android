package classes

import java.sql.Date
import java.sql.Timestamp
import javax.print.attribute.standard.DateTimeAtCreation

data class BankAccount(
    private val accountNumber: String,
    val balance: Double,
    val isFreezed: Boolean,
    val accountType: String,
    val currency: String,
    val createdDate: Timestamp? = Timestamp(System.currentTimeMillis()),
){
    fun ShowAccountNumber(): String {
        val hashAccNum = "****${accountNumber.takeLast(4)}"
        return hashAccNum
    }
}

fun main() {
    val acc = BankAccount(
        accountNumber = "0987687888",
        balance =10000.00,
        isFreezed = false,
        accountType = "Saving",
        currency = "USD"
    )

    println(acc.ShowAccountNumber())
}