class pizzas (
    val name: String,
    val size: String,
    val price:Int
)

fun main() {
    val menu = listOf(
        pizzas("Cheese Pizza","Small",350),
        pizzas("Cheese Pizza","Medium",699),
        pizzas("Cheese Pizza","Large",999),
        pizzas("Veggie Pizza","Small",399),
        pizzas("Veggie Pizza","Medium",799),
        pizzas("Veggie Pizza","Large",1099),
        pizzas("Tikka Pizza","Small",419),
        pizzas("Tikka Pizza","Medium",819),
        pizzas("Tikka Pizza","Large",1199),
        pizzas("Behari Kabab Pizza","Small",450),
        pizzas("Behari Kabab Pizza","Medium",899),
        pizzas("Behari Kabab Pizza","Large",1199)
    )

    val groupedMenu = menu.groupBy { it.size }

    val smallPizzas = groupedMenu["Small"] ?: listOf()
    val mediumPizzas = groupedMenu["Medium"] ?: listOf()
    val largePizzas = groupedMenu["Large"] ?: listOf()

    println("Small Pizzas")
    smallPizzas.forEach {
        println("Name: ${it.name} - Price: ${it.price}")
    }

    println("Medium Pizzas")
    mediumPizzas.forEach {
        println("Name: ${it.name} - Price: ${it.price}")
    }

    println("Large Pizzas")
    largePizzas.forEach {
        println("Name: ${it.name} - Price: ${it.price}")
    }
}