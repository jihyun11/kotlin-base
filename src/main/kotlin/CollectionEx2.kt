fun main() {
    val numbers = listOf(-3, 7, 2, -10, 1)

    //아이템 각각에 연산한 값을 추가하여 새 리스트로 반환
    //-3의 경우, (-30, 7)이라는 값이 나옴
    println(numbers.flatMap { listOf(it * 10, it + 10) })

    //인덱스 숫자에 요소가 있으면 그 요소를 반환, 없으면 괄호 안 50을 반환
    println(numbers.getOrElse(1) {50})
    println(numbers.getOrElse(10) {50})

    val names = listOf("A", "B", "C", "D")

    //numbers와 names를 짝지어 한 리스트로 합치기 (1은 짝이 맞지 않으므로 제외된다)
    println(names zip numbers)
}


class CollectionEx2 {
}