fun main(){
    for(i in 0..9){ // i value starts with 0 and run again and again and on each iteration it increases by 1 until the value is greater than 9 occurs
        println("Runs $i time")
    }

    val namesList = mutableListOf<String>()
    namesList.add("Muhammad Shahzaib")
    namesList.add("AbdulAleem")
    namesList.add("Muhammad Umar Draz")

    for (name in namesList){ // runs for every element in list
        println("Hey! $name")
    }
}