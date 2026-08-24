// Last updated: 8/24/2026, 11:15:48 AM
1class Solution {
2    private boolean ispalindrome(String s, int l, int r) {
3        while (l < r) {
4            if (s.charAt(l) != s.charAt(r)) return false;
5            l++;
6            r--;
7        }
8        return true;
9    }
10
11    public boolean validPalindrome(String s) {
12        int l = 0, r = s.length() - 1;
13        while (l < r) {
14            if (s.charAt(l) == s.charAt(r)) {
15                l++;
16                r--;
17            } else {
18                return ispalindrome(s, l, r - 1) || ispalindrome(s, l + 1, r);
19            }
20        }
21        return true;
22    }
23}