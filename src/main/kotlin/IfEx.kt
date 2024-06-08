fun main() {

    var a = 7
    var b = "Hi"

    if (a == 7) {
        println("값이 맞습니다")
    }

    doWhen(a)
    doWhen(b)

//    for (i in 0..9) {
//        println(i)
//    }
//
//    for (i in 9 downTo 0) {
//        println(i)
//    }

    loop@for (i in 1..10) {
        for (j in 1..10) {
            if (i == 1 && j == 2) break@loop
            println("i: $i, j: $j")
        }
    }
}

fun doWhen(a: Any) {
    when (a) {
        7 -> println("7입니다")
        is Int -> println("Int가 맞습니다")
        else -> println("어떤 조건도 맞지 않습니다")
    }
}

