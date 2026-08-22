// Last updated: 8/22/2026, 9:53:01 AM
1class Solution {
2    public int countKeyChanges(String s) {
3        s = s.toLowerCase();
4        int count = 0;
5        for (int i = 1; i < s.length(); i++) {
6            if (s.charAt(i) != s.charAt(i - 1)) {
7                count++;
8            }
9        }
10        return count;
11    }
12}