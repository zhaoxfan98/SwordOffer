/*
 * @lc app=leetcode.cn id=559 lang=golang
 *
 * [559] N 叉树的最大深度
 */

// @lc code=start
/**
 * Definition for a Node.
 * type Node struct {
 *     Val int
 *     Children []*Node
 * }
 */

func maxDepth(root *Node) int {
	if root == nil {
		return 0
	}
	depth := 0
	for i := 0; i < len(root.Children); i++ {
		depth = max(depth, maxDepth(root.Children[i]))
	}
	return depth + 1
}

func max(x, y int) int {
	if x > y {
		return x
	}
	return y
}

// @lc code=end

