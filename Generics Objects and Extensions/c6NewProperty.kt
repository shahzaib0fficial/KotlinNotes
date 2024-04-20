//class student{
//    companion object studentProgress{
//        var total: Int = 10
//        var answered: Int = 3
//    }
//}
//
//val student.studentProgress.progressText: String
//    get() = "${student.answered} of ${student.total} answered."
//
//fun student.studentProgress.progressBar(){
//    repeat(student.answered){print("▓")}
//    repeat(student.total-student.answered){ print("▒") }
//    println()
//    println(student.progressText)
//}


//Using interface

interface Progress {
    val progressText: String
    fun progressBar()
}

class student: Progress{
    companion object studentProgress{
        var total: Int = 10
        var answered: Int = 3
    }
    override val progressText: String
        get() = "${student.answered} of ${student.total} answered."

    override fun progressBar() {
        repeat(student.answered){print("▓")}
        repeat(student.total-student.answered){ print("▒") }
        println()
        println(progressText)
    }
}

fun main(){
    student().progressBar()
}