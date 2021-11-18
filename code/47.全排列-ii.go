/*
 * @lc app=leetcode.cn id=47 lang=golang
 *
 * [47] 全排列 II
 */

// @lc code=start
func permuteUnique(nums []int) (ans [][]int) {
	sort.Ints(nums)
	n := len(nums)
	perm := []int{}
	vis := make([]bool, n)
	var backtrack func(int)
	backtrack = func(idx int) {
		if idx == n {
			ans = append(ans, append([]int(nil), perm...))
			return
		}
		for i, v := range nums {
			//加上 !vis[i-1]来去重主要是通过限制一下两个相邻的重复数字的访问顺序
			if vis[i] || i > 0 && !vis[i-1] && v == nums[i-1] {
				continue
			}
			perm = append(perm, v)
			vis[i] = true
			backtrack(idx + 1)
			vis[i] = false
			perm = perm[:len(perm)-1]
		}
	}
	backtrack(0)
	return
}

// @lc code=end

