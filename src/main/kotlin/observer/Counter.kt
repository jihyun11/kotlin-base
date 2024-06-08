package observer

class Counter(var listener: EventListener) {

    fun count() {
        for (i in 1..100) {
            if (i % 5 == 0) {
                listener.onEvent(i)
            }
        }
    }
}