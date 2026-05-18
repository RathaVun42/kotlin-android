Kotlin

internal is an access modifier, that allow us can only use our code in its module, if different module we won't abled to use it.

Ex.

    internal class Saving(
    accountNumber: String,
    balance: Double,
    isFreezed: Boolean,
    private var interestRate: Double,
    private var year: Int
    ){
    --block code--
    }

--> we can only use this class inside our module.
--> module is where we coding our code and store that file. like src folder when we first create kotlin project (that src folder we call module).

--> to create new module, we can right click on our project name then choose new->module->set name->choose system building-> finish.
--> to able accessing the class from other module we need to add dependency.


singleton object:


object : standalone singleton. we can access its members by using its name with that member. object doesn't belong to any class so we can use it everywhere even different modules.

--> Use object when you need a single global/shared instance.

EX.

    object Database {
        fun connect() {
        println("Connected")
        }
    }


companion object: Singleton inside a class. it belongs to class. to use its member, we just call className with that membername. Companion object can have name or done have. It also can inheritance, implement from other class.
--> Use companion objects for things related to a class itself rather than its instances.
Ex.

    class User {
        init{
            User.numOfUser ++   // mean that whenever have one instance, numOfuser will be increased by one.REMEMBER numOfUser is belonged to class not any object.
        }
        companion object {
            fun create() = User()
            var numberOfuser = 0
        }
    }

Data class: Normally data class is used as a referent type for obj.
We cannot open, sealed, abstract, or interface it.
However, data class also can have some method inside its body.

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
