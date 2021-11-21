/*
* @lc app=leetcode.cn id=594 lang=java
 *
 * [594] 最长和谐子序列
 */

// @lc code=start
class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int begin = 0, res = 0;
        for (int end=0; end<nums.length; end++) {
            while(nums[end]-nums[begin]>1)  begin++;
            if (nums[end]-nums[begin] == 1) {
                res = Math.max(end-begin+1, res);
            }
        }
        return res;
    }
}
// @lc code=end

