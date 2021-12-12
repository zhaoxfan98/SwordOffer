/*
 * @lc app=leetcode.cn id=239 lang=java
 *
 * [239] 滑动窗口最大值
 */

// @lc code=start
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length==0)return new int[0];
        int[] res=new int[nums.length-k+1];
        res[0]=Integer.MIN_VALUE;
        //第一个滑动窗口
        for(int j=0;j<k;j++){
            res[0]=Math.max(res[0],nums[j]);
        }
        //后续滑动窗口
        for (int i=1; i<res.length; i++) {
            //新滑入的数字大于上一个滑动窗口的最大值
            if (nums[i+k-1] >= res[i-1]) res[i]=nums[i+k-1];
            else {
                //划出的数字不等于上一个窗口的最大值，说明这个窗口的最大值与上一个窗口最值相等
                if (nums[i-1] != res[i-1]) {
                    res[i] = res[i-1];
                } else {
                    //重新遍历 确定最大值
                    res[i]=Integer.MIN_VALUE;
                    for (int j=i;j<k+i;j++) {
                        res[i] = Math.max(res[i],nums[j]);
                    }
                }
            }
        }
        return res;
    }
}
// @lc code=end

