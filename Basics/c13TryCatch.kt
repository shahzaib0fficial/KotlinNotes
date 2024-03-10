fun main(){
    val input = readLine() ?: "0"

    val num = try { // try to convert input to integer if any error happens it throws error
        input.toInt()
    }catch (e : Exception){ // in case of error 0 is assigned to num
        0
    }

    println("You Entered $num")
}