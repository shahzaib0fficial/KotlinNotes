fun main() {
//    val animal = setOf("Dog","Cat","Lion") // declear and initialize set

    val Animal = mutableListOf<String>() // declear mutable list

    Animal.add("Dog") // add elements in set
    Animal.add("Cat") // add elements in set
    Animal.add("Lion") // add elements in set

    Animal.remove("Lion") // remove element from set

    for (animal in Animal) {
        println(animal) // printing set value
    }

    println(Animal.contains("Lion")) // checking that element exists or not
    println("Cat" in Animal) // checking that element exists or not
}