// Last updated: 8/22/2026, 9:54:53 AM
1class Solution {
2    public int minimumPushes(String A) {
3        int q = A.length() >> 3;
4        int r = A.length() & 7;
5        return ((q << 2) + r) * (q + 1);
6    }
7}