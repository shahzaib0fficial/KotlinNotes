fun main(){
    val nullValue:Int? = null // ? allows us to assign null value
    println(nullValue)

    val input1 = readLine() ?: "0" // if by some reason readLine() returns null then "0" is assigned to input1
    val input2 = readLine() ?: "0" // if by some reason readLine() returns null then "0" is assigned to input2

    val num1 = input1?.toIntOrNull()?:0 // if null values enters then 0 will be assigned
    val num2 = input2?.toIntOrNull()?:0 // if null values enters then 0 will be assigned

    val result = num1 + num2

    println(result)
}