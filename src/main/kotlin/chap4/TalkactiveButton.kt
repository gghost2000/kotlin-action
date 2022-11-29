package chap4

internal open class TalkactiveButton : Focusable {
    private fun yell() = println("YELL")
    protected fun whisper() = println("Whis")
}

//fun TalkactiveButton.giveSpeech() {
//    yell()
//    whisper()
//}