fun main() {
    var a = Drink()
    a.drink()

    //현재 b는 수퍼클래스인 Drink 객체로 업캐스팅 됐다
    var b : Drink = Cola()
    b.drink()

    //is는 조건문 안에서만 잠시 다운캐스팅 된다
    if (b is Cola) {
        b.washDishes()
    }

    //as로 다운캐스팅 하기
    var c = b as Cola
    c.washDishes()

    b.washDishes()
}


open class Drink {
    var name = "음료"

    open fun drink() {
        println("마십니다")
    }
}

class Cola: Drink() {
    var type = "콜라"

    override fun drink() {
        println("${name} 중에 ${type}를 마십니다")
    }

    fun washDishes() {
        println("${type}로 설거지를 합니다.")
    }
}