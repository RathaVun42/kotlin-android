package classes

/**
 * In kotlin primary constructor, its parameters can be both properties and parameters (in case we declare them as val or var),
 * but secondary cannot be.
 */
public class Student(
    private val fullName: String,
    val sex: Gender,
    val age: Int,
){
    var address = "Unknown" // this one is also a class property
    // init block is a block of code that will be executed after primary constructor is created
    // then block code in secondary constructor will be executed
    init {
        println("This is init block.")
    }
    constructor(firstName: String, lastName: String, sex: Gender, age: Int, address: String):this(
        fullName = firstName + " " + lastName,
        sex = sex,
        age = age,
    ){
        if(address.isEmpty()){
            throw Error("Address can't be empty")
        }
        this.address = address
    }

    fun GetStudentName():String{
        return this.fullName
    }
}
fun main(){
    val stu1 = Student("Ratha Vun", Gender.Male, 30)
    val stu2 = Student("Ratha", "Vun", Gender.Female, 30, "Phnom Penh")
    val StudentLists = listOf<Student>(stu1, stu2)
    StudentLists.forEach { stu ->
        println(
            "Name ${stu.GetStudentName()} \n" +
                    "Sex ${stu.sex} \n" +
                    "Age ${stu.age} \n" +
                    "Address ${stu.address}\n"
        )
    }

}