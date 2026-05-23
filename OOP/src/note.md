Kotlin

internal is an access modifier, that allow us can only use our code in its module, if different module we won't able to use it.

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
--> module is where we're coding our code and store that file. like src folder when we first create kotlin project (that src folder we call module).

--> to create new module, we can right-click on our project name then choose new->module->set name->choose system building-> finish.
--> to be able accessing the class from other module we need to add dependency.


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
--> Overloading operator: In Kotlin, operator overloading means giving special behavior to operators like:

-->* remember: overloading operator fun must be named the same as operator (plus, minus, times, div, equals ...)

    +  -  *  /  ==  []  ++
Ex.

    data class Point(val x: Int, val y: Int) {
        operator fun plus(other: Point): Point {
            return Point(x + other.x, y + other.y)
        }
    }

There are some available overloading operator

    | Operator   | Converted To  |
    | ---------- | ------------- |
    | `a + b`    | `a.plus(b)`   |
    | `a - b`    | `a.minus(b)`  |
    | `a * b`    | `a.times(b)`  |
    | `a / b`    | `a.div(b)`    |
    | `a == b`   | `a.equals(b)` |
    | `a[i]`     | `a.get(i)`    |
    | `a[i] = x` | `a.set(i, x)` |

Copy is a build in function of data class. It copies reference from other data class object and assign to a new object. We also can modify all the properties that we just copied.

    val transaction3 = transaction2.copy(accountNo = "3872974") // for any property that didn't modify, keep the same.

Destructuring use to separate properties of data class object.

    val (accountNumber, amount, accountDestination) = transaction1  //full destructuring

    val (_, amount, accountDestination) = transaction1 // partial destructuring: mean that we just use _ to fill the order of a property that we dont want.

Remember: the properties inside val () must be ordered to the properties inside data class object.

Extension function: Kotlin extensions let you extend a class or an interface with new functionality without using inheritance or design patterns.

We use extension function when:
    
    You cannot modify the original class
    You want cleaner utility functions
    You want to add helper behavior

How to make extension function: 
    
    fun ClassName.extensionFuncName(){
        --code---
    }
Remember: extension function doesn't belong to class it just class extends, so it cannot use any protected or private property. It doesn't recommend for polymorphism, because it doesn't follow polymorphism runtime, and it follows reference type.
It cannot be overridden.

    | Feature                 | Member Function | Extension Function |
    | ----------------------- | --------------- | ------------------ |
    | Inherited               | Yes             | Not really         |
    | Overridable             | Yes             | No                 |
    | Runtime polymorphism    | Yes             | No                 |
    | Based on runtime object | Yes             | No                 |
    | Based on reference type | No              | Yes                |

Base on reference type like what?
    
    open class Animal
    class Dog : Animal()
    
    fun Animal.sound() = println("Animal sound")
    fun Dog.sound() = println("Dog sound")
    
    val a: Animal = Dog()
    a.sound()
    
    Output:
    
    Animal sound // it's not dog sound because extension function follows to reference type, and referenc type of a is Animal.
                 // this calls base on reference type.

We can use extension function with any class.
Remember: if we make extension function for any class, only that class member that can use that extension function.

We also can have extension property, extension companion object too.
    
    fun ClassName.companion.funName(): return type{
        --code--
    }
    val ClassName.companion.propertyName get() = classProperty
    var ClassName.companion.propertyName get() = classProperty
        set(value) = {
            classProperty = value
        }

    val Example.fullName: String
        get() = "$firstName $lastName"

    var Example.age: Int
        get() = num
        set(value) {
        num = value
        }
Remember: extension property never store value itself. Like we can see even thought we can set new value, that value is assigned to num that is class member.

Extension as member: Normally we create Extension at top level of project, but we also allow you to create Extension property ot function in side other class, but it can only be accessed by the class and subclass itself.