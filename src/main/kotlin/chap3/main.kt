package chap3

fun main(args: Array<String>) {

    // 확장함수 확인
    var list = listOf("1","2","3")

    println(list.joinToString(";"))

    // 확장 프로퍼티 확인

    println("Kotlin".lastChar)

    val sb = StringBuilder("Kotlin?")
    sb.lastChar = '!'

    println(sb)

    println("12.345-6.A".split("\\.|-".toRegex()))

    // 로컬함수 확인
    var user = User(1,"이름", "주소")
    saveUser(user)

}