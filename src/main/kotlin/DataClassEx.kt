//일반 클래스
class General(val name: String, val id: Int)

//Data 클래스
data class DataClassEx(val name: String, val id: Int) {
}

fun main() {
    val a = General("아일릿 원희 너무예뻐", 1)

    println(a == General("아일릿 원희 너무좋아", 1))
    println(a.hashCode())
    println(a)


    val b = DataClassEx("아일릿 원희 너무예뻐", 1)
    println(b == DataClassEx("아일릿 원희 너무좋아", 1))
    println(b.hashCode())
    println(b)

    println(b.copy())
    println(b.copy("이로하"))
    println(b.copy(id = 2))

    var list = listOf(DataClassEx("원희", 1),
                        DataClassEx("이로하", 2),
                        DataClassEx("모카", 3))

    for ((a, b) in list) {
        println("${a}, ${b}")
    }
}