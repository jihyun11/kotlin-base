package observer


fun main() {
    EventPrinter().start()
}

//다형성
//class EventPrinter: EventListener {
//    override fun onEvent(count: Int) {
//        print("${count}-")
//    }
//
//    fun start() {
//        val counter = Counter(this)
//        counter.count()
//    }
//}

//익명객체
class EventPrinter {
    fun start() {
        val counter = Counter(object: EventListener {
            override fun onEvent(count: Int) {
                print("${count}-")
            }
        })

        counter.count()
    }
}


