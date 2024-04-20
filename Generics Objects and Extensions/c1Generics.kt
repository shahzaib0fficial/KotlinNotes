class Questions<T>( // Here T is generic data type and passed while creating and instance
    val question: String,
    val answer: T,
    val difficulty: String
){
    public fun display() {
        println("-------------------------------------")
        println("Question) "+question)
        println("Answer) "+answer)
        println("Difficulty) "+difficulty)
    }
}

fun main() {
    val question1 = Questions<String>("Fill in the _____","Blanks","Easy")
    question1.display()
    val question2 = Questions<Boolean>("The sky is green. True or false",false,"Medium")
    question2.display()
    val question3 = Questions<Int>("How many days are there between full moons?",28,"Hard")
    question3.display()
}