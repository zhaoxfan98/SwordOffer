/*
 * @lc app=leetcode.cn id=1 lang=golang
 *
 * [1] 两数之和
 */

// @lc code=start
package code

func twoSum(nums []int, target int) []int {
	set := map[int]int{}
	for i, v := range nums {
		if _, ok := set[target-v]; ok {
			return []int{i, set[target-v]}
		}
		set[v] = i
	}
	return []int{}
}

// @lc code=end
