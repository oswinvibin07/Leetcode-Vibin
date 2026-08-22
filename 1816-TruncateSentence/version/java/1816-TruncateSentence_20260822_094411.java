// Last updated: 8/22/2026, 9:44:11 AM
1class Solution {
2    public String truncateSentence(String s, int k) {
3                    int i=0;
4        while ( i < s.length()) {
5            if (s.charAt(i++) == ' ') {
6                k--;
7                if (k == 0)
8                    break;
9            }
10        }
11           if(i==s.length())
12        return  s.substring (0,i);
13           return s.substring(0,i-1);
14}}