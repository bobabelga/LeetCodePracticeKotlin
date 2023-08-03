package easy

fun main() {
    println(isPalindrome(121))
    println(isPalindrome(1221))
    println(isPalindrome(1201))
    println(isPalindrome(12210))
}

fun isPalindrome(x: Int): Boolean {
    if (x < 0) return false
    var y = x
    var inter = 0
    while (y != 0) {
        inter = y % 10 + inter * 10
        y /= 10
    }
    return x == inter
}