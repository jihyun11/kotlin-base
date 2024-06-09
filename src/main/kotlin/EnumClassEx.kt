enum class EnumClassEx(val message: String) {
    SING("노래"),
    EAT("밥"),
    SLEEP("잠");

    fun isSleeping() = this == SLEEP
}

fun main() {
    //Sing
    var enumClassEx = EnumClassEx.SING
    println(enumClassEx)

    //true (같은 sleep 객체끼리 비교했으므로)
    enumClassEx = EnumClassEx.SLEEP
    println(enumClassEx.isSleeping())

    enumClassEx = EnumClassEx.EAT
    println(enumClassEx.message)
}