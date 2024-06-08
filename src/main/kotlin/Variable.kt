class variable {


}

fun main() {

    //변수 선언하기
    var a: Int = 1232
    println(a)

    //형변환
    var b: Long = a.toLong()
    println("b: $b")

    //배열 만들기
    var inArr = arrayOf(1,2,3,4,5)
    var nullArr = arrayOfNulls<Int>(5)

    //배열에 값 넣어보기
    nullArr[0] = 6;
    nullArr = arrayOf(7, 8, 9, 10)

    //for문으로 출력해 보기
    for (i in nullArr) {
        println(i)
    }


}

