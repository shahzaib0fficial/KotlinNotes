class Pizzas (
    val name: String,
    val size: String,
    val price:Int
)

fun main() {
    val menu = listOf(
        Pizzas("Cheese Pizza","Small",350),
        Pizzas("Veggie Pizza","Small",399),
        Pizzas("Tikka Pizza","Small",419),
        Pizzas("Behari Kabab Pizza","Small",450)
    )

    val pizzaNames = menu.map {
        it.name
    }

    pizzaNames.forEach {
        println(it)
    }
}