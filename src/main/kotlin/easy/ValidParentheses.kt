package easy

import java.util.Stack

fun main() {
    println(isValid("([]"))
    println(isValid("()"))
    println(isValid(")("))
    println(isValid("()[]{}"))
    println(isValid("(){}}{"))
    println(isValid("(]"))
}

fun isValid(s: String): Boolean {
    if (s.length % 2 != 0 || s[0] in charArrayOf(')', ']', '}')) return false

    val stack = Stack<Char>()
    for (i in 0..s.length - 1) {
        val pr = s[i]
        if (pr in charArrayOf('(', '[', '{'))
            stack.push(pr)
        else {
            val top = if (stack.empty()) '@' else stack.pop()
            if ((pr == ')') && !top.equals('(')) return false
            if ((pr == ']') && !top.equals('[')) return false
            if ((pr == '}') && !top.equals('{')) return false
        }
    }
    return stack.empty()
}

//"()[]{}"