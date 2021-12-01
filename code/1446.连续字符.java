/*
 * @lc app=leetcode.cn id=1446 lang=java
 *
 * [1446] 连续字符
 */

// @lc code=start
class Solution {
    public int maxPower(String s) {
        char[] chars = s.toCharArray();
        int count = 1, max = 0;
        for (int i=1; i<chars.length; i++) {
            count += chars[i] == chars[i-1] ? 1:-count+1;
            max = Math.max(count, max);
        }
        return Math.max(count, max);
    }
}
// @lc code=end

