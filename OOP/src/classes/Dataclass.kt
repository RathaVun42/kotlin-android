package classes

import java.sql.Timestamp
import java.time.Instant
import java.time.ZoneId
import java.time.format.DateTimeFormatter

enum class Currency{
    RIEL,USD
}

data class BankAccount(
    private val accountNumber: String,
    val balance: Double,
    val isFreezed: Boolean,
    val accountType: String,
    val currency: Currency,
    val createdDate: Timestamp = Timestamp(System.currentTimeMillis()),
){
    fun ShowAccountNumber(): String {
        //val hashAccNum = "****${accountNumber.takeLast(4)}"
        return accountNumber
    }
}
fun BankAccount.ShowCurrency(): String {
    return when(currency){
        Currency.USD  -> "$"
        Currency.RIEL -> "រ"
    }
}
fun Double.formatter(): String {
    return "%,.2f".format(this)
}
fun BankAccount.formattedAccNo(): String {
    var accNo = ShowAccountNumber()
    var pre = ""
    if(accNo.length <12){
        var time = 12 - accNo.length

        while (time>0){
            pre += '0'
            time -= 1
        }
        accNo = pre + accNo
    }else{
        throw Exception("Invalid AccNo")
    }
    return "${accNo.take(4)}-${accNo.substring(4,8)}-${accNo.takeLast(4)}"
}

fun Timestamp.formatedDate(): String {
    val datetimeformater = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy")
    //val date = createdDate.toLocalDateTime().format(datetimeformater)
    val date = Instant.ofEpochMilli(this.time).atZone(ZoneId.systemDefault()).format(datetimeformater)
    return date.toString()
}
fun main() {
    val acc = BankAccount(
        accountNumber = "098768788832",
        balance =10000.00,
        isFreezed = false,
        accountType = "Saving",
        currency = Currency.RIEL
    )
    val acc1 = BankAccount(
        accountNumber = "68788833",
        balance =10000.00,
        isFreezed = false,
        accountType = "Saving",
        currency = Currency.USD
    )


    println(acc.balance.formatter() + " " + acc.ShowCurrency())
    try {
        println(acc1.formattedAccNo())
    }catch (e: Exception){
        println(e.message)
    }

    println(acc1.balance.formatter() + " " + acc1.ShowCurrency())
    println(acc1.createdDate.formatedDate())
}