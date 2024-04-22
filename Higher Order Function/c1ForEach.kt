class Pizza (
    val name: String,
    val size: String,
    val price:Int
)

fun main() {
    val menu = listOf(
        Pizza("Cheese Pizza","Small",350),
        Pizza("Cheese Pizza","Medium",699),
        Pizza("Cheese Pizza","Large",999),
        Pizza("Veggie Pizza","Small",399),
        Pizza("Veggie Pizza","Medium",799),
        Pizza("Veggie Pizza","Large",1099),
        Pizza("Tikka Pizza","Small",419),
        Pizza("Tikka Pizza","Medium",819),
        Pizza("Tikka Pizza","Large",1199),
        Pizza("Behari Kabab Pizza","Small",450),
        Pizza("Behari Kabab Pizza","Medium",899),
        Pizza("Behari Kabab Pizza","Large",1199)
        )

    menu.forEach {
        println("Name: ${it.name} Size: ${it.size} Price: ${it.price}")
    }
}