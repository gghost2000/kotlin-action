package chap4

open class RichButton : Clickable{
    fun disable() {} // 막힌 메소드 상속 불가


    open fun animate() {

    }

    override fun click() {
        TODO("Not yet implemented") //기본적으로 열린 메소드
    }
}