// Last updated: 8/24/2026, 12:02:50 PM
1class Solution {
2    public int titleToNumber(String columnTitle) {
3        long ans = 0;
4        for (int i = 0; i < columnTitle.length(); i++) {
5            char ch = columnTitle.charAt(i);
6            ans = ans * 26 + (ch - 'A' + 1);
7        }
8
9        return (int) ans;
10    }
11}