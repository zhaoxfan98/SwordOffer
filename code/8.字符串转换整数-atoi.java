/*
 * @lc app=leetcode.cn id=8 lang=java
 *
 * [8] 字符串转换整数 (atoi)
 */

// @lc code=start
class Solution {
    public int myAtoi(String str) {
        str = str.trim();
        if (str.length() == 0) return 0;
        boolean isMinus = false;
        char[] ch = str.toCharArray();
        if (ch[0] == '+' || ch[0] == '-' || Character.isDigit(ch[0])) {
            if (ch[0] == '+' || ch[0] == '-') {
                if(ch[0] == '-'){
                    isMinus = true;
                }
                //删除首位
                ch = Arrays.copyOfRange(ch,1,ch.length);
            }
            int index = 0;
            long res = 0;
            while(index < ch.length && Character.isDigit(ch[index])){
                res *= 10;
                res += ch[index] - '0';
                if (res > Integer.MAX_VALUE) {
                    return isMinus ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
                index++;
            }
            return isMinus ? -(int)res : (int)res;
        }
        return 0;
    }
}
// @lc code=end

