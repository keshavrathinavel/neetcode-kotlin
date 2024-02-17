class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {

        val groupedAnagrams = hashMapOf<String, MutableList<String>>()
        val listOfAnagrams = mutableListOf<List<String>>()

        strs.forEach{
            val key = String(it.toCharArray().sortedArray())
            if (groupedAnagrams.contains(key)) {
                groupedAnagrams[key]!!.add(it)
            } else {
                val makeListForMap = mutableListOf<String>()
                makeListForMap.add(it)
                groupedAnagrams[key] = makeListForMap
            }
        }

        groupedAnagrams.values.forEach {
            listOfAnagrams.add(it)
        }
        return listOfAnagrams
    }
}