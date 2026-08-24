// Last updated: 8/24/2026, 12:05:47 PM
1public class Solution {
2    public boolean isPowerOfThree(int n) {
3        int maxPowerOf3 = 1162261467; 
4        return n > 0 && maxPowerOf3 % n == 0;
5    }
6}