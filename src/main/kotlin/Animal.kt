open class Animal (val name: String, var age: Int, var type: String) {
    fun introduce() {
        println("저는 ${type} ${name}이고, ${age}살 입니다.")
    }
}

class Dog (name: String, age: Int) : Animal (name, age, "강아지") {
    fun bark (){
        println("멍멍")
    }
}

class Cat (name: String, age: Int) : Animal(name, age, "고양이") {
    fun meow() {
        println("야옹")
    }
}

fun main() {
    var dog = Dog("모찌", 5)
    dog.introduce()
    dog.bark()

    var cat = Cat("나비", 5)
    cat.introduce()
    cat.meow()

}

