package classes

import jdk.internal.org.jline.reader.History

open class CalculateScore(
    val score: Double,
){
    open var passeScore: Double = 37.5
    open fun isPassed(): Boolean {
        return score >= passeScore
    }
}

class Math( score: Double) : CalculateScore(score) {
    override var passeScore = 72.5
    override fun isPassed(): Boolean {
        return this@Math.score >= passeScore
    }

    fun Math(){

    }
}
class English(score: Double) : CalculateScore(score) {
    override var passeScore = 25.0
    override fun isPassed(): Boolean {
        return this@English.score >= passeScore
    }
}
data class StudentScore(
    val math: CalculateScore,
    val english: CalculateScore,
    val history: CalculateScore,
)

fun main() {
    val math: CalculateScore = Math(100.0)
    val english: CalculateScore = English(30.0)
    val history: CalculateScore = CalculateScore(37.0)
    var i = 5
    var students = mutableListOf<StudentScore>()
    while (i>0){
        val student = StudentScore(math, english,history)
        i -= 1
        students.add(student)
    }




}

