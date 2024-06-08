fun main() {

    //두개의 배열 합치기

    var array = arrayOfNulls<Int>(1)
    array[0] =  1

    val newArray = arrayOf(2, 3, 4, 5)
    val combineArr = arrayOfNulls<Int>(array.size + newArray.size)
    for (i in array.indices) {
        combineArr[i] = array[i]
    }

    for (i in newArray.indices) {
        combineArr[i + array.size] = newArray[i]
    }

    for (i in combineArr) {
        println(i)
    }
}