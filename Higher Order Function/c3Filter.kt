class pizza (
    val name: String,
    val size: String,
    val price:Int
)

fun main() {
    val menu = listOf(
        pizza("Cheese Pizza","Small",350),
        pizza("Cheese Pizza","Medium",699),
        pizza("Cheese Pizza","Large",999),
        pizza("Veggie Pizza","Small",399),
        pizza("Veggie Pizza","Medium",799),
        pizza("Veggie Pizza","Large",1099),
        pizza("Tikka Pizza","Small",419),
        pizza("Tikka Pizza","Medium",819),
        pizza("Tikka Pizza","Large",1199),
        pizza("Behari Kabab Pizza","Small",450),
        pizza("Behari Kabab Pizza","Medium",899),
        pizza("Behari Kabab Pizza","Large",1199)
    )

    val smallPizza = menu.filter {
        it.size == "Small"
    }

    smallPizza.forEach {
        println("Name: ${it.name} Size: ${it.size} Price: ${it.price}")
    }
}