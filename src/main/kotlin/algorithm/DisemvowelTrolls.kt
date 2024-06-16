package algorithm


fun disemvowel(str: String): String {
    var vowels = "aeiouAEIOU"
    return str.filter { it !in vowels }
}

fun main() {
    val result = disemvowel("Hello My World!")
    println(result)
}