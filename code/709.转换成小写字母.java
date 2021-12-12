/*
 * @lc app=leetcode.cn id=709 lang=java
 *
 * [709] 转换成小写字母
 */

// @lc code=start
class Solution {
    public String toLowerCase(String s) {
        if(s == null && "".equals(s)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                sb.append((char)(c+32));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
// @lc code=end

