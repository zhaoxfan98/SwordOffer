/*
 * @lc app=leetcode.cn id=343 lang=java
 *
 * [343] 整数拆分
 */

// @lc code=start
class Solution {
    public int integerBreak(int n) {
        if (n <= 3) return n-1;
        int sum = 1;
        while ( n > 4) {
            sum *= 3;
            n -= 3;
        }
        return sum * n;
    }
}
// @lc code=end

