fun main() {
//    val Student = mapOf( // create map
//        1 to "Shahzaib",
//        2 to "AbdulAleem",
//        4 to "Umar Draz",
//        10 to "Muhannad"
//    )

    val Student = mutableMapOf<Int,String>() // create mutable map
    Student[1] = "Shahzaib" // adding values with setting their keys
    Student[2] = "AbdulAleem" // adding values with setting their keys
    Student[4] = "Umar Draz" // adding values with setting their keys
    Student[10] = "Muhannad" // adding values with setting their keys

    Student.remove(10) // remove element using key

    for (student in Student) {
        println("${student.key} -> ${student.value}") // printing key and values of map
    }

    println(Student.containsKey(2)) // checking if exists
    println(Student.containsValue("Muhannad")) // checking if exists
}