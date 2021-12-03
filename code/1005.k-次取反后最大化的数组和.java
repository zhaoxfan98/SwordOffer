/*
 * @lc app=leetcode.cn id=1005 lang=java
 *
 * [1005] K 次取反后最大化的数组和
 */

// @lc code=start
class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        for (int i=0; i<nums.length && k>0; i++, k--) {
            if (nums[i] >= 0) break;
            else nums[i] = -nums[i];
        }
        Arrays.sort(nums);
        int sum = 0;
        for (int n : nums) sum += n;
        if (k>0 && k % 2 == 1) sum -= 2 * nums[0];
        return sum;
    }
}
// @lc code=end

