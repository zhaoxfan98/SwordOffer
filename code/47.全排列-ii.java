import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=47 lang=java
 *
 * [47] 全排列 II
 */

// @lc code=start
class Solution {
    //存放结果
    List<List<Integer>> result = new ArrayList<>();
    //暂存结果
    List<Integer> path = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] used = new boolean[nums.length];
        Arrays.fill(used, false);
        Arrays.sort(nums);
        backTrack(nums, used);
        return result;
    }

    private void backTrack(int[] nums, boolean[] used) {
        if (path.size() == nums.length) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i=0; i<nums.length; i++) {
            //nums[i-1] == nums[i]，说明同⼀树⽀nums[i - 1]使⽤过
            //used[i - 1] == false，说明同⼀树层nums[i - 1]使⽤过
            //如果同⼀树层nums[i - 1]使⽤过则直接跳过
            if (i>0 && nums[i] == nums[i-1] && used[i-1] == false) {
                continue;
            }
            //如果同⼀树⽀nums[i]没使⽤过开始处理
            if (used[i] == false) {
                used[i]= true;  //标记同一树枝nums[i]使用过，防止同一树枝重复使用
                path.add(nums[i]);
                backTrack(nums, used);
                path.remove(path.size()-1);  //回溯  说明同一树层nums[i]使用过 防止下一树层重复
                used[i] = false;
            }
        }
    }

}
// @lc code=end

