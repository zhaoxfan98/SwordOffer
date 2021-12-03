/*
 * @lc app=leetcode.cn id=79 lang=java
 *
 * [79] 单词搜索
 */

// @lc code=start
class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (dfs(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int i, int j, int start) {
        if (start == word.length()) return true;
        if (i<0 || j<0 || i==board.length || j==board[0].length) return false;
        if (board[i][j] == word.charAt(start)) {
            char temp = board[i][j];
            board[i][j] = ' ';
            if (dfs(board, word, i, j+1, start+1) ||
                dfs(board, word, i, j-1, start+1) ||
                dfs(board, word, i+1, j, start+1) ||
                dfs(board, word, i-1, j, start+1)) {
                    return true;
                } else {
                    board[i][j] = temp;
                }
        }
        return false;
    }
}
// @lc code=end

