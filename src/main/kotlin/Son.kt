/**
 * Son
 *
 * @author xujianbo
 * @date 2021/3/3 10:16 下午
 * @since 1.0.0
 */
class Son(name: String, age: Int) : Father(name, age) {
    override fun eat() {
        println("son eat too $name")
    }


}

fun main() {
    var son = Son("xuxo", 22)
    println("儿子的名字：${son.name}")
    println("儿子的年龄：${son.age}")
    son.eat()

    var son2 = son
    son2.age = 15

    println("${son.age}")
    println("${son2.name}")

}
