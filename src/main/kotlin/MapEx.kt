class MapEx {
}

fun main() {
    val a = mutableMapOf("레드벨벳" to "음파음파",
                         "아일릿" to "Magnetic",
                         "뉴진스" to "How sweet")

    for (entry in a) {
        println("${entry.key} : ${entry.value}")
    }

    a.put("오마이걸", "번지")
    println(a)

    a.remove("뉴진스")
    println(a)

    println(a["아일릿"])
    println(a["음파음파"]) //value 값으론 안찾아짐
}