class FoodCourt {
    fun searchPrice(foodName: String) {
        val price = when (foodName) {
            FOOD_CREAM_PASTA -> 13000
            FOOD_STEAK -> 25000
            FOOD_PIZZA -> 15000
            else -> 0
        }

        println("${foodName}의 가격은 ${price}원입니다")
    }

    companion object {
        const val FOOD_CREAM_PASTA = "크림파스타"
        const val FOOD_STEAK = "스테이크"
        const val FOOD_PIZZA = "피자"
    }
}

fun main() {
    //companion obj로 상수값 관리
    val foodCourt = FoodCourt()
    foodCourt.searchPrice(FoodCourt.FOOD_PIZZA)

    //lateinit로 늦은 초기화
    val a = LateInitSample()
    println(a.getLateInitText())
    a.text = "새로 할당한 값"
    println(a.getLateInitText())

    //lazy
    //변수를 사용하는 시점까지 초기화를 늦춰줌
    val number: Int by lazy {
        println("초기화를 합니다")
        7
    }
    println("코드를 시작합니다") //이때 초기화된다
    println(number)
    println(number)
}

//lateinit로 늦은 초기화(일단 변수만 선언하고, 초기값은 나중에 할당할 때 사용)
//String을 제외한 기본 자료형엔 사용 불가
class LateInitSample {
    lateinit var text: String

    fun getLateInitText(): String {
        //initialized 되었는지 체크하는 구문
        if(::text.isInitialized) {
            return text
        } else {
            return "기본값"
        }
    }
}