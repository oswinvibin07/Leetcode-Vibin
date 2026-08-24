// Last updated: 8/24/2026, 11:24:11 AM
1class Solution {
2    public void reverseString(char[] s) {
3        for (int i = 0, j = s.length - 1; i < j; i++, j--) {
4            char temp = s[i];
5            s[i] = s[j];
6            s[j] = temp;
7        }
8    }
9}