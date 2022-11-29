package chap2

import java.lang.IllegalArgumentException

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Int, val right: Int) : Expr
fun eval (e: Int) : Int {
    if (e is Num){
        e.value
    }

    if (e is Sum) {
        return eval(e.left) + eval(e.right)
    }

    throw IllegalArgumentException("Unknown")
}