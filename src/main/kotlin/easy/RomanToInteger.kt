package easy

fun main() {
    println(romanToInt("III"))
    println(romanToInt("LVIII"))
    println(romanToInt("MCMXCIV"))
}

fun romanToInt(s: String): Int {
    var number = 0
    var i = 0
    while (i < s.length) {
        when (s[i]) {
            'I' -> {
                if (i + 1 < s.length) {
                    if (s[i + 1] == 'V') {
                        number += 4
                        i++
                    } else if (s[i + 1] == 'X') {
                        number += 9
                        i++
                    } else
                        number += 1


                } else
                    number += 1
                i++
            }

            'V' -> {
                number += 5
                i++
            }

            'X' -> {
                if (i + 1 < s.length) {
                    if (s[i + 1] == 'L') {
                        number += 40
                        i++
                    } else if (s[i + 1] == 'C') {
                        number += 90
                        i++
                    } else
                        number += 10

                } else
                    number += 10
                i++

            }

            'L' -> {
                number += 50
                i++
            }

            'C' -> {
                if (i + 1 < s.length) {
                    if (s[i + 1] == 'D') {
                        number += 400
                        i++
                    } else if (s[i + 1] == 'M') {
                        number += 900
                        i++
                    } else
                        number += 100

                } else
                    number += 100
                i++

            }

            'D' -> {
                number += 500
                i++
            }

            'M' -> {
                number += 1000
                i++
            }
        }
    }
    return number
}

/*

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000


I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.

 */