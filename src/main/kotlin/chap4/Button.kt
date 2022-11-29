package chap4

class Button : Clickable,Focusable {
    override fun click() {
        println("clicked")
    }

    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}