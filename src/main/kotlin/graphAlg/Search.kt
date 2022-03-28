package graphAlg

fun binarySearch(sortList: List<Int>, item: Int): Int? {

    var low = 0
    var high = sortList.size - 1

    while (low < high) {
        val mid = (low + high) / 2
        val guess = sortList[mid]
        when {
            guess < item -> low = mid + 1
            guess > item -> high = mid - 1
            else -> {
                return mid
            }
        }
    }

    return null
}

fun main() {

    val index = binarySearch(listOf(1, 4, 6, 9, 10, 13, 16, 17, 19, 20, 28, 30, 37, 39), 29)
    println(index)

    listOf(1, 4, 6, 9, 10, 13, 16, 17, 19, 20, 28, 30, 37, 39).indexOf(29)


}