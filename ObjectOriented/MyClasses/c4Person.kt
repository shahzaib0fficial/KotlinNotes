package MyClasses

abstract class c4Person(name:String) {
    init {
        println("Hi $name")
    }
    abstract fun location()
}