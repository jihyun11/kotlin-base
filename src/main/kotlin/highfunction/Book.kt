package highfunction

class Book (var name: String, var price: Int){
    fun discount() {
        price -= 2000
    }

    fun sell() {
        println("${name}이 오늘만 ${price}원")
    }
}

fun main() {

    //run이 부르는 price (run은 지역변수를 우선시한다)
    var price = 5000

    //let이 부르는 price
    var a = Book("디모의 코틀린", 10000).apply {
        name = "[초특가]" + name
        discount()
    }

    a.run {
        println("${name}이 오늘만 ${price}원")
    }

    a.let {
        println("${it.name}이 오늘만 ${it.price}원")
    }
}