// Last updated: 8/22/2026, 9:46:46 AM
1class Solution {
2    public int countSubstrings(String s) {
3        int count = 0;
4
5        for (int i = 0; i < s.length(); i++) {
6            
7            count += expand(s, i, i);
8            
9            count += expand(s, i, i + 1);
10        }
11        return count;
12    }
13
14    private int expand(String s, int left, int right) {
15        int count = 0;
16    
17        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
18            count++;
19            left--;
20            right++;
21        }
22        return count;
23    }
24}