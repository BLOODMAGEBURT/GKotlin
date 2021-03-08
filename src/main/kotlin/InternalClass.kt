/**
 * InternalClass
 *
 * @author xujianbo
 * @date 2021/3/8 10:40 下午
 * @since 1.0.0
 */
class Outer {

    // 伴生对象，类似于java的 static
    companion object {
        val age: Int = 20
    }

    val name: String = "xu"

    // 嵌套类，类似于 静态内部类
    class Inner {

        fun printAge() {

            println("age is $age")
        }
    }


    // 内部类
    inner class RealInner {

        fun printName() {
            println("name is $name")
        }
    }
}

fun main() {
    Outer.Inner().printAge()

    Outer().RealInner().printName()
}