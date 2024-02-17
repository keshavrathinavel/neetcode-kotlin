class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {

        val hashmap = mutableMapOf<Int, Int>()
        var diff = 0
        for (i in nums.indices) {
            diff = target - nums[i]
            if (hashmap.containsKey(diff)) {
                return intArrayOf(hashmap[diff]!!, i)
            }
            hashmap[nums[i]] = i
        }
        return intArrayOf()
    }
}