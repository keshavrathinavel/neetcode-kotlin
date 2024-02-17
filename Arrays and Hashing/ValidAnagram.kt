class Solution {
    fun isAnagram(s: String, t: String): Boolean {

        val sCount = s.groupingBy{ it }.eachCount()
        val tCount = t.groupingBy{ it }.eachCount()

        return sCount == tCount
    }
}
