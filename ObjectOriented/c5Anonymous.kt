import MyClasses.c4Person

fun main(){
    val umar = object : c4Person("Umar Draz"){
        override fun location() {
            println("Currently in Faisalabad")
        }
    }
    umar.location()
}