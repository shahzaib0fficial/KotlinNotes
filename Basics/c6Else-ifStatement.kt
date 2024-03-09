fun main(){
    val a = 5
    if(a == 3){ // if condition true this part will run
        println("a == 3")
    }else if(a == 5){ // if condition true this part will run
        println("a == 5")
    }else{ // if not any condition true this part will run
        println("None")
    }
    val b = if(a<=3) 3 else 5
    println("B : $b")
}