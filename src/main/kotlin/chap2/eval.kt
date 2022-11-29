package chap2

import chap2.Expr.*

fun eval(e: Expr): Int {
    if (e is Num) {
        e.value
    }

    if (e is Sum) {
        return eval(e.left) + eval(e.right)
    }

    throw IllegalArgumentException("Unknown")
}
