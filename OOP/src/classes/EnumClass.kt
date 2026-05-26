package classes

enum class AccountType(val type: String, val code: String) {
    SAVING("Saving", "001"),
    DEPOSIT("Deposit", "002"),
    GOLD("Gold", "003"),
    // SAVING, DEPOSIT, AND GOLD are name of enum member, about type and code are property of that member.
    // Those properties also follow to the constructor property of enum class.
}
data class Account1(
    val id: String,
    val type: AccountType,
){

}
var listAccount = mutableListOf<Account1>(
    Account1(
        "001",
        AccountType.SAVING
    ),
    Account1(
        "002",
        AccountType.GOLD
    ),
    Account1(
        "003",
        AccountType.DEPOSIT
    ),
    Account1(
        "004",
        AccountType.SAVING
    ),
)
fun checkAccType(type: String): AccountType{
    val accType = when(type.lowercase()){
        AccountType.SAVING.type.lowercase() -> AccountType.SAVING
        AccountType.DEPOSIT.type.lowercase() -> AccountType.DEPOSIT
        AccountType.GOLD.type.lowercase() -> AccountType.GOLD
        else -> AccountType.DEPOSIT
    }
    return accType
}
fun Account1.ShowAccountInfo(){
    println("Account id: ${this.id}\nAccount type: ${this.type}")
}
fun main() {
    listAccount.forEach {account ->
        val accountType = when (account.type) {
            AccountType.SAVING -> "Saving"
            AccountType.DEPOSIT -> "Deposit"
            AccountType.GOLD -> "Gold"
        }
        println("Account id: ${account.id}\ntype: $accountType")
    }

    val inputAccType = "saving"
    val accType = checkAccType(inputAccType)

    listAccount.add(Account1("005", accType))
    listAccount.find { account1 ->
        account1.id == "0050"
    }?.ShowAccountInfo()
}