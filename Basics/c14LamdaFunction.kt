fun main(){
    val programmingLanguages = listOf("C","C++","C#","Java","Python","JavaScript")
//    val count = programmingLanguages.count { language -> // lambda function
//        language.length >= 3 // returns true/false
//    } // default count function

    val count = programmingLanguages.customCount { language -> language.length >= 3 } // make our oun custom function for counting and pass a lambda function
    println("Count : $count")
}

fun List<String>.customCount(function: (String) -> Boolean) : Int { // in parameter this takes a lambda function and describe which type of data it takes and what it's returning
    var count = 0
    for (element in this){ // iterate for each element of list
        if(function(element)){
            count++
        }
    }
    return count
}