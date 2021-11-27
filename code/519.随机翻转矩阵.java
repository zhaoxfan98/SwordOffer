/*
 * @lc app=leetcode.cn id=519 lang=java
 *
 * [519] 随机翻转矩阵
 */

// @lc code=start
class Solution {
    int m, n;
    Set<Integer> set = new HashSet<>();
    Random random = new Random(300);
    public Solution(int _m, int _n) {
        m = _m;
        n = _n;
    }
    
    public int[] flip() {
        int a = random.nextInt(m*n), b=a;
        while (a>=0 && set.contains(a)) a--;
        while (b<m*n && set.contains(b)) b++;
        int c = a >= 0 && !set.contains(a) ? a : b;
        set.add(c);
        return new int[]{c/n, c%n};
    }
    
    public void reset() {
        set.clear();
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(m, n);
 * int[] param_1 = obj.flip();
 * obj.reset();
 */
// @lc code=end

