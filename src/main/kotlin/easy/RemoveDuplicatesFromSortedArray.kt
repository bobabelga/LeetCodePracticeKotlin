package easy


fun removeDuplicates(nums: IntArray): Int {
    var uniqueNumbers = 1
    for (i in (0..<nums.size - 1)) {
        if (nums[i] != nums[i + 1]) {
            nums[uniqueNumbers] = nums[i + 1]
            uniqueNumbers++
        } else
            nums[i] = nums[i + 1]
    }
    println(nums.toList())
    return uniqueNumbers
}

fun main() {
    val intArray = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
    val intArray2 = intArrayOf(1, 1, 2)
    println(removeDuplicates(intArray))
    println(removeDuplicates(intArray2))
}