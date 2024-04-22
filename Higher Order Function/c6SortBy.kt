class P (
    val name: String,
    val size: String,
    val price:Int
)

fun main() {
    val menu = listOf(
        P("Cheese Pizza","Small",350),
        P("Cheese Pizza","Medium",699),
        P("Cheese Pizza","Large",999),
        P("Veggie Pizza","Small",399),
        P("Veggie Pizza","Medium",799),
        P("Veggie Pizza","Large",1099),
        P("Tikka Pizza","Small",419),
        P("Tikka Pizza","Medium",819),
        P("Tikka Pizza","Large",1199),
        P("Behari Kabab Pizza","Small",450),
        P("Behari Kabab Pizza","Medium",899),
        P("Behari Kabab Pizza","Large",1199)
    )

    val alphabaticalSort = menu.sortedBy { it.name }

    alphabaticalSort.forEach {
        println("Name: ${it.name} Size: ${it.size} Price: ${it.price}")
    }
}