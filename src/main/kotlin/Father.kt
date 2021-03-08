/**
 * Father
 *
 * @author xujianbo
 * @date 2021/3/3 10:15 下午
 * @since 1.0.0
 */
open class Father(var name: String, var age: Int) {

    val sex: String = "male"

    open fun eat() {
        println("father eat meat")
    }

    fun add(x: Int, y: Int) = x + y
}