fun main(){
    val programmingLanguages = listOf("C","C++","C#","Java","Python","JavaScript")
    val value = listOf(11,123,312,13213,4,1231)

    val count1 = programmingLanguages.custom { language -> language.length >= 3 }
    val count2 = value.custom { value -> value >= 10 }
    println("Count1 : $count1")
    println("Count2 : $count2")
}

fun <T>List<T>.custom(function: (T) -> Boolean) : Int { // Here T is generic that allows us to call that function for any datatype
    var count = 0
    for (element in this){
        if(function(element)){
            count++
        }
    }
    return count
}