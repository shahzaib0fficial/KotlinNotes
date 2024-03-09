fun main(){
    val inputValue = readLine()?.toIntOrNull()?:0

    when(inputValue){
        in 0..10 -> println("Value is lies between 0 to 10")
        in 11..100 -> println("Value is lies between 11 to 100")
        else -> println("Value is not between 0 to 100")
    }
}