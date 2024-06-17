package algorithm

class HighestAndLowest {
}

fun highAndLow(numbers: String): String {
    val numberList = numbers.split(" ").map { it.toInt() }
    val max = numberList.maxOrNull()
    val min = numberList.minOrNull()

    return "$max $min"
}

fun main() {
    var numbers = "1 2 -3 4 5"
    println(highAndLow(numbers))

}