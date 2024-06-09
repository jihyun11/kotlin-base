fun read (x: Int) {
    println("숫자 $x 입니다")
}

fun read(x: String) {
    println(x)
}

fun deliveryItem (name: String, count: Int = 1, destination: String = "집") {
    println("${name}, ${count}개를 ${destination}에 배달하였습니다.")
}

//파라미터 지정해두지 않고 여러개 넣고 싶을 때
//vararg는 배열처럼 쓸 수 있다.
//다른 파라미터와 쓸 때는 맨 마지막에 위치해야 한다.
fun sum(vararg numbers: Int) {
    var sum = 0

    for (n in numbers) {
        sum += n
    }

    println(sum)
}

infix fun Int.multiply(x: Int): Int = this * x

fun main() {
    read(7)
    read("감사합니다")

    deliveryItem("돈까스")
    deliveryItem("책", 3)
    deliveryItem("노트북", 30, "학교")
    deliveryItem("선물", destination = "친구집")

    sum(1, 2, 3, 4)

    //6이 this, 4가 infix함수의 파라미터
    println(6 multiply 4)
}