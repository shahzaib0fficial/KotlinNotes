fun main(){
//    Arrays
    val names = arrayOf("Muhammad Shahzaib","AbdulAleem","Muhammad Umar Draz") // initialize array when declared
    println("Name : " + names[1]) // index starts with 0

    lateinit var values : Array<Int> // just declaring array

    values = Array(3){0} // initializing array where each elements value is 0
    values[0] = 1 // setting value in array at index 0
    values[1] = 2 // setting value in array at index 1
    values[2] = 3 // setting value in array at index 2
    println("Value : " + values[0])

//    Lists
//    val todos = listOf("Todo 1","Todo 2") // fixed sized list

//    val todos = mutableListOf("Todo 1","Todo 2") // dynamic sized list
//    todos.add("Todo 3")

    val todos = mutableListOf<String>()
    todos.add("Todo 1")
    todos.add("Todo 2")
    todos.add("Todo 3")
    println("Todo : " + todos[2])
}