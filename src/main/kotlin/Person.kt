open class Person (open var name: String, open val birthYear: Int) {
    fun introduce(): String {
        return ("안녕하세요, ${birthYear}년생 ${name}입니다.")
    }

    fun introduce2(name2: String, birthYear2: Int): String {
        return ("안녕하세요, ${birthYear2}년생 ${name2}입니다.")
    }
}

fun main() {
    var a = Person("박보영", 1990)
    var b = Person("전정국", 1997)

    val p = a.introduce();
    println(p)

    val p2 = b.introduce();
    println(p2)

    val p3 = a.introduce2("장원영", 2004)
    println(p3)
}
