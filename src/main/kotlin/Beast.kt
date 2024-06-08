open class Beast {
    open fun eat() { //수퍼클래스에서 open이 붙어 있다면, 서브클래스에서 마음대로 override 가능
        println("음식을 먹습니다.")
    }
}

class Tiger : Beast() {
    override fun eat() { //대신 override 할 함수 앞엔 override글자를 붙여 주기
        println("고기를 먹습니다.")
    }
}

fun main() {
    var t = Tiger() //Tiger 클래스의 Tiger 객체를 생성
    t.eat()
}