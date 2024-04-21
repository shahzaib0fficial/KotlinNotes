fun main() {
//    val friends = listOf("AbdulAleem","Huzaifa Bin Naeem","Umar Draz","Muhannad") // declear and initialize list

    val Friends = mutableListOf<String>() // declearing mutable list

    Friends.add("AbdulAleem") // adding element in mutable list
    Friends.add("Huzaifa Bin Naeem") // adding element in mutable list

    Friends.add(1,"Umar Draz") // adding element in mutable list at specified index
    Friends.add(2,"Muhannad Asif") // adding element in mutable list at specified index

    Friends[3] = "Kamran Ahmed" // overwriting values

    Friends.add("Huzaifa Bin Naeem") // adding element in mutable list

    Friends.removeAt(3) // removing element through index
    Friends.remove("Huzaifa Bin Naeem") // removing element through value

    for (friend in Friends) {
        println(friend)
    }

    println("AbdulAleem" in Friends) // checking that element presents in list
    println(Friends.contains("Kamran Ahmed")) // checking that element presents in list
}