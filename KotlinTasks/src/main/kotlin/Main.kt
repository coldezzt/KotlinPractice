fun main() {

}

fun twoSum(nums: IntArray, target: Int): IntArray {
    for (i in 0 until nums.size - 1){
        for (j in i + 1 until nums.size) {
            if (nums[i] + nums[j] == target) {
                return intArrayOf(i, j)
            }
        }
    }
    return intArrayOf(0, 0)
}

fun romanToInt(s: String): Int {
    var result = 0
    val numbers = mutableListOf<Int>()
    for (i in s.indices) {
        when (s[i]) {
            'I' -> numbers.add(1)
            'V' -> numbers.add(5)
            'X' -> numbers.add(10)
            'L' -> numbers.add(50)
            'C' -> numbers.add(100)
            'D' -> numbers.add(500)
            'M' -> numbers.add(1000)
        }
    }

    for (i in 0 until s.length - 1) {
        if (numbers[i] >= numbers[i + 1]) {
            result += numbers[i]
        } else {
            result -= numbers[i]
        }
    }

    result += numbers[numbers.size - 1]

    return result
}

fun isPalindrome(x: Int): Boolean {
    var s = x.toString()
    for(i in 0 until s.length / 2) {
        if (s[i] != s[s.length - 1 - i]) {
            return false
        }
    }
    return true
}

fun removeDuplicates(nums: IntArray) : Int {
    var counter = 0
    var pointer = 0
    var prev = -1
    for (i in nums.indices) {
        if (prev != nums[i]) {
            nums[pointer] = nums[i]
            pointer += 1
            prev = nums[i]
            counter += 1
        }
    }
    return counter
}