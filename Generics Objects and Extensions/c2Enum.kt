class Question<T>(
    val question: String,
    val answer: T,
    val difficulty: Difficulty,
){
    public fun display() {
        println("-------------------------------------")
        println("Question) "+question)
        println("Answer) "+answer)
        println("Difficulty) "+difficulty)
    }
}

enum class Difficulty { // This is an enum class
    Easy,Medium,Hard
}

fun main() {
    val question1 = Question<String>("Fill in the _____","Blanks", difficulty = Difficulty.Easy)
    question1.display()
    val question2 = Question<Boolean>("The sky is green. True or false",false,Difficulty.Medium)
    question2.display()
    val question3 = Question<Int>("How many days are there between full moons?",28,Difficulty.Hard)
    question3.display()
}