/**
 * VarTest
 *
 * @author xujianbo
 * @date 2021/3/5 9:54 上午
 * @since 1.0.0
 */
class VarTest(val name: String, val age: Int) {

    override fun toString(): String {
        return "VarTest($name,$age)"
    }
}

fun main() {
    println(calculate(1, 2, ::add));

    println(calculate(2, 3) { a, b -> a * b })

    println(calculate(3, 4, fun(x: Int, y: Int): Int {
        return x + y
    }))


    println(fooX(5).invoke(2))
    println(fooY(5).invoke())
}

fun calculate(a: Int, b: Int, opt: (Int, Int) -> Int): Int {
    return opt(a, b);
}

fun add(x: Int, y: Int) = x + y

fun mul(x: Int, y: Int) = x * y

val add2 = { x: Int, y: Int -> x + y }

fun fooX(x: Int): (Int) -> Int = { y -> (x + y) * y }

fun fooY(x: Int): () -> Int = { x * x }

