// Last updated: 8/22/2026, 9:41:59 AM
1class Solution {
2    public int maxLengthBetweenEqualCharacters(String s) {
3        int ans = -1;
4        for (int left = 0; left < s.length(); left++) {
5            for (int right = left + 1; right < s.length(); right++) {
6                if (s.charAt(left) == s.charAt(right)) {
7                    ans = Math.max(ans, right - left - 1);
8                }
9            }
10        }
11        
12        return ans;
13    }
14}
15