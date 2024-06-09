class NestedClassEx {
}

fun main() {
    Outer.Nested().introduce()

    val outer = Outer()
    val inner = outer.Inner()

    inner.introduceInner()
    inner.introduceOuter()

    outer.text = "Changed Outer Class"
    inner.introduceOuter()
}


open class Outer {
    var text = "Outer Class"

    //중첩클래스 (외부 클래스의 내용을 공유할수없음)
    class Nested {
        fun introduce() {
            println("Nested Class")
        }
    }

    //내부클래스 (외부 클래스의 속성과 함수 사용가능)
    inner class Inner {
        var text = "Inner Class"

        fun introduceInner() {
            println("text")
        }

        //outer, inner 클래스에 같은 이름의 속성/함수가 있다면 'this@Outer클래스이름' 으로 참조 가능
        fun introduceOuter() {
            println(this@Outer.text)
        }
    }
}
