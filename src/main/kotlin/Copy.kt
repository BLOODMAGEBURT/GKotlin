/**
 * Copy
 *
 * @author xujianbo
 * @date 2021/3/8 9:26 下午
 * @since 1.0.0
 */
data class Bird(val weight: Double, var age: Int, var color: String, var dice: Dice)

object SingleObject {
    var name: String = "xu"
    var age: Int = 12
}


fun main() {
    val bird = Bird(20.00, 19, "red", Dice(6))

    val copy = bird.copy()
    copy.color = "blue"

    val (weight, age, color) = bird;

    println("weight:$weight, age:$age, color:$color")


    println(bird.dice === copy.dice) // true, 证明是浅拷贝

    copy.dice.sides = 5  // 修改同一块内存中的值，会同时修改两者

    println("bird1's color:${bird.color}, copy's color:${copy.color}")
    println("bird1's dice is ${bird.dice}, copy's dice is ${copy.dice}")
}