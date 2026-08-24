// Last updated: 8/24/2026, 11:26:13 AM
1class Solution {
2    public int numJewelsInStones(String jewels, String stones) {
3        int count = 0;
4        for (char j : jewels.toCharArray()) {
5            for (char s : stones.toCharArray()) {
6                if (j == s) {
7                    count++;
8                }
9            }
10        }
11        return count;
12    }
13}