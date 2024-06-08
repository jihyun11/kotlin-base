class ConstructorPerson (var name: String, var birthYear: Int){
    init {
        println("안녕하세요, ${this.birthYear}년생 ${this.name}입니다.")
    }

    constructor(name: String) : this(name, 2007) {
        println("보조생성자가 사용되었습니다.")
    }
}

fun main() {
    var a = ConstructorPerson("이원희", 2007)
    var b = ConstructorPerson("이로하", 2008)

    var c = ConstructorPerson("아이유")

}