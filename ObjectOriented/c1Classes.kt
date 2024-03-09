class myClass(val name: String,val age : Int){ // primary constructor
    init { // calls just after the constructor
        println("Hi $name")
        println("You are $age year old")
    }
}

class myClass2{
    constructor(name: String,age: Int){ // Secondary Constructor
        println("Hi $name")
        println("You are $age year old")
    }
}

fun main(){
    myClass("Muhammad Shahzaib",19)
    myClass2("AbdulAleem",20)
}