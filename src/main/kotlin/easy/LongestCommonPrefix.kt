package easy

fun main() {
    println(longestCommonPrefix(arrayOf("flower", "flow", "flight")))
    println(longestCommonPrefix(arrayOf("dog", "racecar", "car")))
}

fun longestCommonPrefix(strs: Array<String>): String {
    var prefix = ""
    if (strs.isEmpty()) return prefix
    var index = 0
    for (c in strs[0]) {
        for (i in 1..<strs.size) {
            if (index >= strs[i].length || c != strs[i][index])
                return prefix
        }
        prefix += c
        index++
    }
    return prefix
}