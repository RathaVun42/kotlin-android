package classes

import java.util.Collections.singleton

class Singleton private constructor(
    var name: String,
) {
    companion object {

        @Volatile  //mean always read the latest value from memory, this is also called as multithreading safety
                   //it makes other threads can have the same value of instance below.
        private var instance: Singleton? = null

        fun getInstance() =
            instance ?: synchronized(this) { // inside companion obj this refers to companion obj itself
                                                    //synchronized, use to lock obj. Mean this object can run only by one thread at this time, no thread run simultaneously
                instance ?: Singleton("Ranta").also { instance = it }
            }
    }

    fun doSomething() = "Doing something"
}
fun main() {
    val instance = Singleton.getInstance()
    val instance2 = Singleton.getInstance()
    instance2.name = "dara"
    println(instance.name)
}
//this is singleton class, the class that ensure that we can only instance object once.
//With private constructor we can't create instance, but we can use property of companion obj that reference from THe class as object.
//no matter how many times you create instance with this way, obj that instance from class can be only one.
//Like example, I try to create 2 instance from the class through companion obj property. THen I change the property name of class.
//Then access it like example above, the result name is only one here. No matter which instance I use to change the property, the property still share the same value to its instance.


//However, if we want the easiest way of create singleton, we just use companion object directly and declare any property that we want to share to all instances.