import interfaceEX.Eater
import interfaceEX.Runner

class InterfaceDog : Runner, Eater {
    override fun run() {
        println("우다다다 뜁니다")
    }

    override fun eat() {
        println("냠냠냠")
    }
}

fun main() {
    var dog = InterfaceDog()
    dog.eat()
    dog.run()
}