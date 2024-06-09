fun main() {
    UsingGeneric(GeniricEx()).doShouting()
    UsingGeneric(GenericB()).doShouting()
    UsingGeneric(GenericC()).doShouting()

    doShouting(GenericB())
}

fun <T: GeniricEx> doShouting(t: T) {
    t.shout()
}

open class GeniricEx {
    open fun shout() {
        println("A가 소리칩니다")
    }
}

class GenericB : GeniricEx() {
    override fun shout() {
        println("B가 소리칩니다")
    }
}

class GenericC : GeniricEx() {
    override fun shout() {
        println("C가 소리칩니다")
    }
}

class UsingGeneric<T:GeniricEx>(val t: T) {
    fun doShouting() {
        t.shout()
    }
}