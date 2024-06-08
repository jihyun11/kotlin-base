class Exercise {

    fun test(): Int {
        var test = 1
        return test
    }


}

fun main(args: Array<String>) {

    //Exercise 클래스 안의 test 함수를 사용하기
    var exercise = Exercise()
    var result = exercise.test()
    println("결과값: $result")
}