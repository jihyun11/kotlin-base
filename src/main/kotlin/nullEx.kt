fun main() {
    var a: String? = null

    println(a?.toUpperCase()) //뒤 함수를 실행시킨 결과가 null이면 실행을 안시킴 (a의 값이 그대로 출력)

    println(a?:"default".toUpperCase()) //뒤 결과가 null이어도 그대로 출력

    println(a!!.toUpperCase()) //exception이 뜨도록 의도적으로 설정

    //스코프 함수
    a?.run {
        println(toUpperCase())
    }


    //객체의 동일성 검증
    var a1 = Product("콜라", 1000)
    var b = Product("콜라", 1000)
    var c = a1
    var d = Product("사이다", 1000)

    //내용은 같지만, 서로 다른 객체이다
    println(a1 == b)
    println(a1 === b)

    //내용도 같고, 서로 같은 객체이다
    println(a1 == c)
    println(a1 === c)

    //내용도 서로 다르고, 서로 다른 객체이다
    println(a1 == d)
    println(a1 === d)
}

//객체의 동일성 검증
class Product(val name: String, val price: Int) {
    override fun equals(other: Any?): Boolean {
        if (other is Product) {
            return other.name == name && other.price == price
        } else {
            return false
        }
    }
}