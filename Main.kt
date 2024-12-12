import kotlin.math.PI

fun main() {
    val diameter: Float = 90.00F
    val resultat = pizzaArea(diameter)
    println("El area de su pizza és: $resultat cm²")
}

fun pizzaArea(diameter: Float): Double {
    return PI * (diameter/2 * diameter/2)
}