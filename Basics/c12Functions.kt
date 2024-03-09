fun main(){
    print5Statements()
    println("Sum : " + sum(val2 = 5)) // setting val2 parameter value to 5
    println("Sum : " + sum(2,3)) // overwrite val1 value to the value sent from here
    val value = 10
    println("Is Even : " + value.isEven())
}

fun print5Statements(){
    for (i in 0..5){
        println(i)
    }
}

fun sum(val1: Int = 10, val2: Int) : Int{ // val1 value is deftly 10 in case the value is not sent while calling
    return val1 + val2
}

fun Int.isEven() : Boolean{ // this function can be access with any integer value
    return this % 2 == 0
}