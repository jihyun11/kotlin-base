fun main() {
    val nameList = listOf("원희", "이로하", "민주", "모카", "윤아")

    nameList.forEach{print(it+" ")}
    println()

    //원으로 시작하는 사람 리스트
    println(nameList.filter { it.startsWith("원") })

    //각각 이름들 앞에 이름: 이라는 문자열 추가
    println(nameList.map{ "이름: " + it })

    //장원영 이라는 사람이 있는지
    println(nameList.any{ it == "장원영" })

    //이름이 모두 3글자인지
    println(nameList.all { it.length == 3 })

    //이로 시작하는 사람이 하나도 없는지 (하나도 없어야 true 반환)
    println(nameList.none{ it.startsWith("이" )})

    //민으로 시작하는 첫번째 사람
    println(nameList.first{ it.startsWith("민" )})

    //민으로 시작하는 마지막 사람
    println(nameList.last{ it.startsWith("민" )})

    //이름에 카가 들어가는 사람이 몇명인지
    println(nameList.count{ it.contains("카")})




    //list를 map으로 바꿔줌
    val personsList = listOf(
        Persons("윤아", 2004),
        Persons("민주", 2004),
        Persons("모카", 2004),
        Persons("원희", 2007),
        Persons("이로하", 2008)
    )
    //생년을 기준으로 묶어 map 만들기
    println(personsList.associateBy { it.birthYear })

    //이름을 기준으로 묶어 map 만들기
    println(personsList.groupBy{ it.name })

    //2004년 보다 큰지 비교해 리스트로 나누기
    val (over04, under04) = personsList.partition { it.birthYear > 2004 }
    println(over04)
    println(under04)


}

data class Persons(val name: String, val birthYear: Int)

class CollectionEx {

}

