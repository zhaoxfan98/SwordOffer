/*
 * @lc app=leetcode.cn id=384 lang=golang
 *
 * [384] 打乱数组
 */

// @lc code=start
type Solution struct {
	items []int
}

func Constructor(nums []int) Solution {
	return Solution{items: nums}
}

func (this *Solution) Reset() []int {
	return this.items
}

func (this *Solution) Shuffle() []int {
	nums := make([]int, len(this.items))
	copy(nums, this.items)
	rand.Shuffle(len(nums), func(i, j int) {
		nums[i], nums[j] = nums[j], nums[i]
	})
	return nums
}

/**
 * Your Solution object will be instantiated and called as such:
 * obj := Constructor(nums);
 * param_1 := obj.Reset();
 * param_2 := obj.Shuffle();
 */
// @lc code=end

