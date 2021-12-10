/*
 * @lc app=leetcode.cn id=748 lang=java
 *
 * [748] 最短补全词
 */

// @lc code=start
class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        licensePlate = licensePlate.toLowerCase();
        int count[] = new int[26];
        for (int i=0; i<licensePlate.length(); i++) {
            if (licensePlate.charAt(i)>='a' && licensePlate.charAt(i)<='z') {
                count[licensePlate.charAt(i)-'a']++;
            }
        }
        int k = -1, l = 16; //分别记录最短符合串的坐标和长度
        for (int i=0; i<words.length; i++) {
            if (words[i].length() < l && isCompletingWord(count, words[i])) {
                k = i;
                l = words[i].length();
            }
        }
        return words[k];
    }

    public boolean isCompletingWord(int count[],String s){
        int c[] = new int[26];
        for (int i=0; i<s.length(); i++) {
            c[s.charAt(i)-'a']++;
        }
        for (int i=0; i<26; i++) {
            if (count[i] > c[i]) return false;
        }
        return true;
    }

}
// @lc code=end

