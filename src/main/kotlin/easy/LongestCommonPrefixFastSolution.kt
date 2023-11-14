package easy

fun main() {
    println(longestCommonPrefixFast(arrayOf("flower", "flow", "flight")))
    println(longestCommonPrefixFast(arrayOf("dog", "racecar", "car")))
//    val bo="Boba"
//    println(bo.indexOf("o"))
//    println(bo.indexOf("i"))
}

fun longestCommonPrefixFast(strs: Array<String>): String {
    var prefix = ""
    if (strs.isEmpty()) return prefix
    prefix = strs[0]
    for (i in 1..<strs.size) {
        while (strs[i].indexOf(prefix) != 0) {
            prefix = prefix.substring(0, prefix.length - 1)
        }
    }
    return prefix
}