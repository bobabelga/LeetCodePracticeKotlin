package easy

import java.util.Stack

fun main() {
    println(isValid("([}}])"))
    println(isValid("([]"))
    println(isValid("()"))
    println(isValid(")("))
    println(isValid("()[]{}"))
    println(isValid("(){}}{"))
    println(isValid("(]"))
}

fun isValid(s: String): Boolean {
    if (s.length % 2 != 0 || s[0] == ')' || s[0] == ']' || s[0] == '}') return false
    val stack = Stack<Char>()
    for (c in s){
        if (c == '(' || c == '[' ||c == '{')
            stack.push(c)
        else {
            if ((c == ')') && !stack.empty() && stack.peek() == '(') stack.pop()
            else if ((c == ']') && !stack.empty() && stack.peek() == '[') stack.pop()
            else if ((c == '}') && !stack.empty() && stack.peek() == '{') stack.pop()
            else return false
        }
    }
    return stack.empty()
}