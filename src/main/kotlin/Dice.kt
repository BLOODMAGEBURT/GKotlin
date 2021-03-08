import kotlin.random.Random

/**
 * Dice
 *
 * @author xujianbo
 * @date 2021/3/6 12:12 上午
 * @since 1.0.0
 */
fun main() {
    var dice = Dice(12)

    println(dice.sides)
    println("roll num is ${dice.roll()}")
}

class Dice(var sides: Int) {


    fun roll(): Int {
        return Random.nextInt(sides + 1)
    }

    override fun toString(): String {
        return "Dice($sides)"
    }
}