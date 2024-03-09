fun main(){
    val nullValue:Int? = null // ? allows us to assign null value
    println(nullValue)

    val input1 = readLine()
    val input2 = readLine()

    val num1 = input1?.toIntOrNull()?:0 // if null values enters then 0 will be assigned
    val num2 = input2?.toIntOrNull()?:0 // if null values enters then 0 will be assigned

    val result = num1 + num2

//    val num1 = try {
//        input1?.toInt() ?: 0 // input1? here is checking if value is not null if null then toInt() is not called and ?: value assigns to num1 if any null occurs
//    }catch (e:NumberFormatException){
//        println("Error Occurs")
//        0 // returning 0 of catch block
//    }
//    val num2 = try {
//        input2?.toInt() ?: 0 // input2? here is checking if value is not null if null then toInt() is not called and ?: value assigns to num1 if any null occurs
//    }catch (e:NumberFormatException){
//        println("Error Occurs")
//        0 // returning 0 of catch block
//    }

//    val result = num1 + num2

    println(result)
}