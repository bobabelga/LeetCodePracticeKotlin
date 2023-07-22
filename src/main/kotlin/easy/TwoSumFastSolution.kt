package easy


fun main() {
    val inArray = IntArray(3)
    inArray[0] = 3
    inArray[1] = 2
    inArray[2] = 4
//    inArray[3] = 15
    twoSumFastSolution(inArray, 6).forEach { println(it) }
}


fun twoSumFastSolution(nums: IntArray, target: Int): IntArray {
    val twoSomeArray = IntArray(2)
    val map = HashMap<Int, Int>()
    for (i in nums.indices) {
        val def = map[nums[i]]
        if (def != null) {
            twoSomeArray[0] = def
            twoSomeArray[1] = i
            return twoSomeArray
        }
        map[target - nums[i]] = i
    }
    return nums
}