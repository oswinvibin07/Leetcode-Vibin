// Last updated: 8/24/2026, 12:21:43 PM
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int maxs=Integer.MIN_VALUE;
4        int subAsum=0;
5        for (int i=0; i<nums.length; i++){
6            subAsum+=nums[i];
7            if (maxs<subAsum){
8                maxs=subAsum;
9            }
10            
11            if (subAsum<0){
12                subAsum=0;
13            }
14        }
15        return maxs;
16    }
17}