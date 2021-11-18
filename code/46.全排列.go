/*
 * @lc app=leetcode.cn id=46 lang=golang
 *
 * [46] 全排列
 */

// @lc code=start
func permute(nums []int) [][]int {
	res := [][]int{}
	visited := map[int]bool{}

	var dfs func(path []int)
	dfs = func(path []int) {
		//触发结束条件
		if len(path) == len(nums) {
			temp := make([]int, len(path))
			copy(temp, path)
			res = append(res, temp)
			return
		}
		for _, n := range nums {
			//排除不合法选择
			if visited[n] {
				continue
			}
			//做选择
			path = append(path, n)
			visited[n] = true
			dfs(path)
			//取消选择
			path = path[:len(path)-1]
			visited[n] = false
		}
	}
	dfs([]int{})
	return res
}

// @lc code=end

