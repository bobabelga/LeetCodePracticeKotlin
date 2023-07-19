package easy

fun main() {
    val inArray = IntArray(4)
    inArray[0] = 2
    inArray[1] = 7
    inArray[2] = 11
    inArray[3] = 15
    twoSum(inArray, 9).forEach { println(it) }
}


fun twoSum(nums: IntArray, target: Int): IntArray {
    val twoSomeArray = IntArray(2)
    loop@ for (i in nums.indices) {
        for (j in i + 1..<nums.size) {
            if (nums[i] + nums[j] == target) {
                twoSomeArray[0] = i
                twoSomeArray[1] = j
                break@loop
            }

        }
    }
    return twoSomeArray
}