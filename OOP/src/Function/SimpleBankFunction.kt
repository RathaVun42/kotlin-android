package Function

data class BankTransaction(
    val transactionId: String,
    val senderName: String,
    val senderAccountNumber: String,
    val receiverAccountNumber: String,
    val transactionDate: String,
    val transactionAmount: Double,
    val transactionCurrency: String,
    val debitAmount: Double,
    val creditAmount: Double,
)

val transactions = listOf<BankTransaction>(
    BankTransaction(
        transactionId = "TXN001",
        senderName = "John Doe",
        senderAccountNumber = "1002003001",
        receiverAccountNumber = "9008007001",
        transactionDate = "2026-05-01",
        transactionAmount = 250.0,
        transactionCurrency = "USD",
        debitAmount = 250.0,
        creditAmount = 0.0
    ),
    BankTransaction(
        transactionId = "TXN002",
        senderName = "Alice Smith",
        senderAccountNumber = "1002003002",
        receiverAccountNumber = "9008007002",
        transactionDate = "2026-05-02",
        transactionAmount = 120.5,
        transactionCurrency = "USD",
        debitAmount = 120.5,
        creditAmount = 0.0
    ),
    BankTransaction(
        transactionId = "TXN003",
        senderName = "David Lee",
        senderAccountNumber = "1002003003",
        receiverAccountNumber = "9008007003",
        transactionDate = "2026-05-03",
        transactionAmount = 500.0,
        transactionCurrency = "USD",
        debitAmount = 0.0,
        creditAmount = 500.0
    ),
    BankTransaction(
        transactionId = "TXN004",
        senderName = "Emma Brown",
        senderAccountNumber = "1002003004",
        receiverAccountNumber = "9008007004",
        transactionDate = "2026-05-04",
        transactionAmount = 80.75,
        transactionCurrency = "USD",
        debitAmount = 80.75,
        creditAmount = 0.0
    ),
    BankTransaction(
        transactionId = "TXN005",
        senderName = "Michael Johnson",
        senderAccountNumber = "1002003005",
        receiverAccountNumber = "9008007005",
        transactionDate = "2026-05-05",
        transactionAmount = 1000.0,
        transactionCurrency = "USD",
        debitAmount = 0.0,
        creditAmount = 1000.0
    ),
    BankTransaction(
        transactionId = "TXN006",
        senderName = "Sophia White",
        senderAccountNumber = "1002003006",
        receiverAccountNumber = "9008007006",
        transactionDate = "2026-05-06",
        transactionAmount = 45.0,
        transactionCurrency = "USD",
        debitAmount = 45.0,
        creditAmount = 0.0
    ),
    BankTransaction(
        transactionId = "TXN007",
        senderName = "Daniel Kim",
        senderAccountNumber = "1002003007",
        receiverAccountNumber = "9008007007",
        transactionDate = "2026-05-07",
        transactionAmount = 670.0,
        transactionCurrency = "USD",
        debitAmount = 0.0,
        creditAmount = 670.0
    ),
    BankTransaction(
        transactionId = "TXN008",
        senderName = "Olivia Green",
        senderAccountNumber = "1002003008",
        receiverAccountNumber = "9008007008",
        transactionDate = "2026-05-08",
        transactionAmount = 320.0,
        transactionCurrency = "USD",
        debitAmount = 320.0,
        creditAmount = 0.0
    ),
    BankTransaction(
        transactionId = "TXN009",
        senderName = "James Wilson",
        senderAccountNumber = "1002003009",
        receiverAccountNumber = "9008007009",
        transactionDate = "2026-05-09",
        transactionAmount = 1500.0,
        transactionCurrency = "USD",
        debitAmount = 0.0,
        creditAmount = 1500.0
    ),
    BankTransaction(
        transactionId = "TXN010",
        senderName = "Charlotte Davis",
        senderAccountNumber = "1002003010",
        receiverAccountNumber = "9008007010",
        transactionDate = "2026-05-10",
        transactionAmount = 75.5,
        transactionCurrency = "USD",
        debitAmount = 75.5,
        creditAmount = 0.0
    ),
    BankTransaction(
        transactionId = "TXN011",
        senderName = "William Taylor",
        senderAccountNumber = "1002003011",
        receiverAccountNumber = "9008007011",
        transactionDate = "2026-05-11",
        transactionAmount = 890.0,
        transactionCurrency = "USD",
        debitAmount = 0.0,
        creditAmount = 890.0
    ),
    BankTransaction(
        transactionId = "TXN012",
        senderName = "Mia Anderson",
        senderAccountNumber = "1002003012",
        receiverAccountNumber = "9008007012",
        transactionDate = "2026-05-12",
        transactionAmount = 60.0,
        transactionCurrency = "USD",
        debitAmount = 60.0,
        creditAmount = 0.0
    ),
    BankTransaction(
        transactionId = "TXN013",
        senderName = "Benjamin Thomas",
        senderAccountNumber = "1002003013",
        receiverAccountNumber = "9008007013",
        transactionDate = "2026-05-13",
        transactionAmount = 410.0,
        transactionCurrency = "USD",
        debitAmount = 0.0,
        creditAmount = 410.0
    ),
    BankTransaction(
        transactionId = "TXN014",
        senderName = "Amelia Martinez",
        senderAccountNumber = "1002003014",
        receiverAccountNumber = "9008007014",
        transactionDate = "2026-05-14",
        transactionAmount = 95.25,
        transactionCurrency = "USD",
        debitAmount = 95.25,
        creditAmount = 0.0
    ),
    BankTransaction(
        transactionId = "TXN015",
        senderName = "Ethan Garcia",
        senderAccountNumber = "1002003015",
        receiverAccountNumber = "9008007015",
        transactionDate = "2026-05-15",
        transactionAmount = 740.0,
        transactionCurrency = "USD",
        debitAmount = 0.0,
        creditAmount = 740.0
    ),
    BankTransaction(
        transactionId = "TXN016",
        senderName = "Harper Clark",
        senderAccountNumber = "1002003016",
        receiverAccountNumber = "9008007016",
        transactionDate = "2026-05-16",
        transactionAmount = 130.0,
        transactionCurrency = "USD",
        debitAmount = 130.0,
        creditAmount = 0.0
    ),
    BankTransaction(
        transactionId = "TXN017",
        senderName = "Alexander Lewis",
        senderAccountNumber = "1002003017",
        receiverAccountNumber = "9008007017",
        transactionDate = "2026-05-17",
        transactionAmount = 2200.0,
        transactionCurrency = "USD",
        debitAmount = 0.0,
        creditAmount = 2200.0
    ),
    BankTransaction(
        transactionId = "TXN018",
        senderName = "Emily Walker",
        senderAccountNumber = "1002003018",
        receiverAccountNumber = "9008007018",
        transactionDate = "2026-05-18",
        transactionAmount = 49.99,
        transactionCurrency = "USD",
        debitAmount = 49.99,
        creditAmount = 0.0
    ),
    BankTransaction(
        transactionId = "TXN019",
        senderName = "Matthew Hall",
        senderAccountNumber = "1002003019",
        receiverAccountNumber = "9008007019",
        transactionDate = "2026-05-19",
        transactionAmount = 980.0,
        transactionCurrency = "USD",
        debitAmount = 0.0,
        creditAmount = 980.0
    ),
    BankTransaction(
        transactionId = "TXN020",
        senderName = "Ava Young",
        senderAccountNumber = "1002003020",
        receiverAccountNumber = "9008007020",
        transactionDate = "2026-05-20",
        transactionAmount = 300.0,
        transactionCurrency = "USD",
        debitAmount = 300.0,
        creditAmount = 0.0
    )
)

fun filterTransactionByDate(list: List<BankTransaction>, date: String): List<BankTransaction> {
    val result = list.filter { transaction -> transaction.transactionDate.compareTo(date) == 0 }
    return result
}

fun searchTransactionById(list: List<BankTransaction>, id: String): BankTransaction? {
    val result = list.find { transaction -> transaction.transactionId.compareTo(id) == 0 }
    return result
}


fun main(){
//    print("Please input the transaction date: ")
//    val date: String = readLine().toString()
//    val result = filterTransactionByDate(transactions, date)
//    if(result.isNotEmpty()){
//        println(result)
//    }else{
//        println("There are no transactions.")
//    }

    print("Please input the transaction id: ")
    val id: String = readLine()!!
    val result = searchTransactionById(transactions, id)


    if(result != null){
        println(result)
    }else{
        println("There is no transaction with that $id")
    }
}