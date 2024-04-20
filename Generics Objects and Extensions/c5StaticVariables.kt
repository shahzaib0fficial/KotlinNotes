class MyClass {
    companion object { // companion is used before the object when we create object inside a class
        var StaticVariable: Int = 0
    }
}

fun main() {
    MyClass.StaticVariable = 10
    println(MyClass.StaticVariable)
}