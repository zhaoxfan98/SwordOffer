/*
 * @lc app=leetcode.cn id=786 lang=java
 *
 * [786] 第 K 个最小的素数分数
 */

// @lc code=start
class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int n = arr.length;
        List<int[]> frac = new ArrayList<int[]>();
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                frac.add(new int[]{arr[i], arr[j]});
            }
        }
        Collections.sort(frac, (x, y) -> x[0]*y[1] - x[1]*y[0]);
        return frac.get(k-1);
    }
}
// @lc code=end

