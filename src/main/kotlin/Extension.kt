import kotlin.random.Random

/**
 * Extension
 *
 * @author xujianbo
 * @date 2021/3/5 1:05 下午
 * @since 1.0.0
 */
class Extension {

    val str = "sdfeffef"


}

fun String.getFirstStr(): String {

    return this[0].toString()
}

fun testRun(str: String?) {

    str?.run {
        println(this.length)
        println("length=${this.length}")
        this.length
    }

    str?.let {
        println(it.length)
        println()
    }

}

fun main() {
//    testRun(null)
//    testRun("abd")

    val rangeInt = 1..6
    val randomInt = rangeInt.random()

    println(randomInt)

    val random1 = Random.nextInt(4)
    println(random1)
}


data class Person(val name: String, val city: String, val phone: String) // 1

