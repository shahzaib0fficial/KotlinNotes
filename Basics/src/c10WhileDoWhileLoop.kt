fun main(){
    var i = 0
    while (i<5){ // if condition is true it runs the code and runs again and again until condition is true
        println("Runs While Loop $i times")
        i++
    }

    i = 0
    do { // if condition is even not true it runs once the code and runs again and again until condition is true
        println("Runs Do-While Loop $i times")
        i++
    }while (i<5)
}