package classes

class User(
    val name: String,
){
    init {
        User.numOfUser++
    }

    /**
     * companion here play an important role as static key word in java, but it much more powerful that static member of java.
     * it can inheritance, implement, be stored as object referent
     * Ex. val ex: sampleClass = objectName.member   we can use it in case we implement other interface with it.
     */
    companion object CheckInstantiation{
        var numOfUser = 0
    }
}


fun main() {
    val user = User("Ratha")
    val user1 = User("Rathana")
    println(user.name)
    println(user1.name)
    println(User.numOfUser)
}