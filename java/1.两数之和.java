/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indexs = new int[2];
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            if (hash.containsKey(nums[i])) {
                indexs[0] = i;
                indexs[1] = hash.get(nums[i]);
                return indexs;
            }
            //将数据存入  value为下标
            hash.put(target-nums[i], i);
        }
        return indexs;
    }
}
// @lc code=end

