abstract class Animal2 {
    abstract fun eat()
    fun sniff() {
        println("킁킁")
    }
}

class Rabbit : Animal2() {
    override fun eat() {
        println("당근을 먹습니다.")
    }
}

fun main() {
    var r = Rabbit()
    r.eat()
    r.sniff()
}