package classes


class Person {
    var name: String? = null
    private var gender: String = ""
    var age: Int = 0
    var height:  Int = 0
    var isStudent : Boolean = false
    lateinit var nickname: String

    fun setGender(gender: String) {
        this.gender = gender
    }
    fun getGender() : String {
        return this.gender
    }
}

enum class Gender{
    Male, Female
}
fun main(){
    val P1 = Person()
    P1.name = "Bunna"
    P1.age = 21
    P1.isStudent = true
    P1.height = 180
    P1.setGender(Gender.Male.name)
    P1.nickname = "Bunny"

    val P2 = Person()
    P2.name = "Kanha"
    P2.isStudent = false
    P2.height = 180
    P2.setGender(Gender.Female.name)
    P2.age = 21
    P2.nickname = "Kan"

    val people: List<Person> = listOf(P1, P2)

    people.forEach{ person ->
        println(person.name)
        println(person.age)
        println(if (person.isStudent) "Is student" else "Not a student")
        println(person.getGender())
        println(person.nickname)
        println()
    }

}