/**
 * Plate
 *
 * @author xujianbo
 * @date 2021/3/9 11:10 上午
 * @since 1.0.0
 */
class Plate<T>(val t: T) {
    val container = mutableListOf<T>()

    init {
        container.add(t)
    }

    fun putInto(t: T) {
        container.add(t)
    }
}

class FruitPlate<T : Fruit>(val t: T)


open class Fruit(val weight: Int)

class Apple(weight: Int) : Fruit(weight)

class Banana(weight: Int) : Fruit(weight)


open class Veg(val weight: Int)

class Potato(weight: Int) : Veg(weight)
class Tomato(weight: Int) : Veg(weight)


fun main() {
    val plate = Plate<Fruit>(Apple(12))
    plate.putInto(Banana(2))

//    plate.putInto(Potato(2))


    for (i in plate.container) {
        println(i)
    }

    val fruitPlate = FruitPlate(Apple(2))
    val fruitPlate2 = FruitPlate(Banana(2))
    
}
