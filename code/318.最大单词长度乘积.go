/*
 * @lc app=leetcode.cn id=318 lang=golang
 *
 * [318] 最大单词长度乘积
 */

// @lc code=start
func maxProduct(words []string) (ans int) {
	masks := make([]int, len(words))
	//用数组masks记录每个单词的位掩码表示
	for i, word := range words {
		for _, ch := range word {
			masks[i] |= 1 << (ch - 'a')
		}
	}
	for i, x := range masks {
		for j, y := range masks[:i] {
			if x&y == 0 && len(words[i])*len(words[j]) > ans {
				ans = len(words[i]) * len(words[j])
			}
		}
	}
	return
}

// @lc code=end

