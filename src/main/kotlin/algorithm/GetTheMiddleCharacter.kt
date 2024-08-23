package algorithm

fun getMiddle(word : String) : String {
    val length = word.length
    val middle = length / 2

    return if (length % 2 == 0) {
        word.substring(middle - 1, middle + 1)
    } else {
        word.substring(middle, middle + 1)
    }
}

fun isDivisibleBy(
    n: Int,
    x: Int,
    y: Int,
): Boolean {
    if (n % x == 0 && n % y == 0) {
        return true
    }
    return false
}

