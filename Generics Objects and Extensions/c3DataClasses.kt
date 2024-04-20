data class DataOfQuestion<T>( // Data class only have variables but not have any methods
    val question: String,
    val answer: T,
    val difficulty: String
)

fun main() {
    val question1 = DataOfQuestion<String>("Fill in the _____","Blanks", "Easy")
    val question2 = DataOfQuestion<Boolean>("The sky is green. True or false",false,"Medium")
    val question3 = DataOfQuestion<Int>("How many days are there between full moons?",28,"Hard")

    println(question1.toString()) // with data class we can use toString() type functions
    println(question2.toString())
    println(question3.toString())
}