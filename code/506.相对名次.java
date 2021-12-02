/*
 * @lc app=leetcode.cn id=506 lang=java
 *
 * [506] 相对名次
 */

// @lc code=start
class Solution {
    public String[] findRelativeRanks(int[] score) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i=0; i<score.length; i++) map.put(score[i], i);
        Arrays.sort(score);
        String[] ans = new String[score.length];
        for (int i=0; i<score.length; i++) {
            int s = map.get(score[i]);
            if (i == score.length - 1) ans[s] = "Gold Medal";
            else if (i == score.length - 2) ans[s] = "Silver Medal";
            else if (i == score.length - 3) ans[s] = "Bronze Medal";
            else ans[s] = String.valueOf(score.length-i);
        }
        return ans;
    }
}
// @lc code=end

