fun main(args: Array<String>) {
    println("Hello World!")
    ok("xubobo")
    testArray()
}

fun ok(name: String) {
    println("$name are you ok?")

    var items = listOf("ar", "df", "fefe")




    for (item in items) {
        println(item)
    }

    for (index in items.indices) {
        println(index)
    }

    var index = 0
    while (index < items.size) {
        println(items.get(index))
        index++
    }
}

fun getString(obj: Any): String {

    return when (obj) {
        is Int -> "is int"
        "hello" -> "hello again"
        is Long -> "Long is Long"
        else -> "UnKnown Thing"
    }
}

fun testArray() {
    var arr = arrayOf("1", "2", "3")
    val text = """
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """.trimMargin()
    println(text)
}
