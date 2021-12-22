/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */

// @lc code=start
class Solution {
    
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '[') stack.push(']');
            else if (ch == '(') stack.push(')');
            else if (ch == '{') stack.push('}');
            else if (stack.isEmpty() || ch != stack.pop()) return false;
        }
        return stack.isEmpty();
    }
}
// @lc code=end

