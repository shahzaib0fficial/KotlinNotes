@file:Suppress("NAME_SHADOWING")

class p (
    val name: String,
    val size: String,
    val price:Int
)

fun main() {
    val menu = listOf(
        p("Cheese Pizza","Small",350),
        p("Cheese Pizza","Medium",699),
        p("Cheese Pizza","Large",999),
        p("Veggie Pizza","Small",399),
        p("Veggie Pizza","Medium",799),
        p("Veggie Pizza","Large",1099),
        p("Tikka Pizza","Small",419),
        p("Tikka Pizza","Medium",819),
        p("Tikka Pizza","Large",1199),
        p("Behari Kabab Pizza","Small",450),
        p("Behari Kabab Pizza","Medium",899),
        p("Behari Kabab Pizza","Large",1199)
    )

    val totalMenuPrice = menu.fold(0.0) {
        total, menu ->
            total + menu.price
    }

    println("Whole menu price: ${totalMenuPrice}")
}