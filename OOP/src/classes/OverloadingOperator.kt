package classes

import java.sql.Timestamp
data class TotalTransactions(val total: Double)
data class Transaction(
    val accountNumber: String,
    val amount: Double,
    val accountDestination: String,
    val date: Timestamp? = Timestamp(System.currentTimeMillis()),
    ){
    operator fun plus(transaction: Transaction): TotalTransactions {
        return TotalTransactions( amount + transaction.amount)
    }
    operator fun plus(total: TotalTransactions): TotalTransactions {
        return TotalTransactions(amount + total.total)
    }
}

fun main() {
    val transaction1 = Transaction(
        accountNumber = "ABC",
        amount = 100.0,
        accountDestination = "ABCD",
    )
    val transaction2 = Transaction(
        accountNumber = "ABC",
        amount = 100.0,
        accountDestination = "ABCD",
    )
    val transaction3 = transaction2.copy(amount = 200.0)
    val transaction4 = transaction3.copy(amount = 900.0)

    //destructuring

    val (accountNumber, amount, accountDestination) = transaction1

    val totalTransactions = transaction1.plus(transaction2.plus(transaction3.plus(transaction4)))
    println(totalTransactions.total)
    println(accountNumber)
}