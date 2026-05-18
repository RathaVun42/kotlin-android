import classes.Saving

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val saving = Saving(
        accountNumber = "0000000099",
        interestRate = 1.2,
        year = 5,
        balance = 10000.0,
        isFreezed = false
    )
    saving.period = 5
    var period = saving.period
    try {
        while (period > 0) {
            saving.applyInterest()
            period -= 1
        }
        saving.withdraw(100000.0)
    }catch (e: Exception){
        println(e.message)
    }


    println("%.2f".format(saving.showBalance()))
}