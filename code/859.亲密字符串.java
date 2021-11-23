/*
 * @lc app=leetcode.cn id=859 lang=java
 *
 * [859] 亲密字符串
 */

// @lc code=start
class Solution {
    public boolean buddyStrings(String s, String goal) {
        //1.当s和goal长度或词频不同，必然不为亲密字符
        //2.当 s与goal 不同的字符数量为2（能够互相交换） 或 s与goal不同的字符数量为0，
        //但同时s中有出现数量超过2的字符（能够互相交换）时，两者必然为亲密字符
        int n = s.length(), m = goal.length();
        //长度不同
        if (n != m) return false;
        int[] cnt1 = new int[26], cnt2 = new int[26];
        int sum = 0;
        for (int i=0; i<n; i++) {
            int a = s.charAt(i)-'a', b = goal.charAt(i) - 'a';
            cnt1[a]++; cnt2[b]++;
            if (a != b) sum++;
        }
        boolean ok = false;
        for (int i=0; i<26; i++) {
            //词频不同
            if (cnt1[i] != cnt2[i]) return false;
            //能够互相交换
            if (cnt1[i] > 1) ok = true;
        }
        return sum == 2 || (sum == 0 && ok);
    }
}
// @lc code=end

