package chap4

interface Focusable {
    fun setFocus(b:Boolean) {
        println("I ${if (b) "got" else "lost"} focus.")
    }

    fun showOff() = println("포커스!!!")
}