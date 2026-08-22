// Last updated: 8/22/2026, 9:40:01 AM
1class Solution {
2    public int maxPower(String s) {
3        int max = 1;
4        int curmax = 1;
5
6        for (int ind = 1; ind < s.length(); ind++) {
7            if (s.charAt(ind) == s.charAt(ind - 1)) {
8                curmax++;
9            } else {
10                curmax = 1;
11            }
12            max = Math.max(curmax, max);
13        }
14
15        return max;
16    }
17}