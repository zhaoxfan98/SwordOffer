/*
 * @lc app=leetcode.cn id=563 lang=golang
 *
 * [563] 二叉树的坡度
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func findTilt(root *TreeNode) int {
	if root == nil {
		return 0
	}
	return abs(sum(root.Left)-sum(root.Right)) + findTilt(root.Left) + findTilt(root.Right)
}

func sum(node *TreeNode) int {
	if node == nil {
		return 0
	}
	return node.Val + sum(node.Left) + sum(node.Right)
}

func abs(x int) int {
	if x < 0 {
		return -x
	}
	return x
}

// @lc code=end

