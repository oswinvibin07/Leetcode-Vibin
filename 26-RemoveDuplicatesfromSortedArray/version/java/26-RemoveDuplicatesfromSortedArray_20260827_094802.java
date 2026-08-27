// Last updated: 8/27/2026, 9:48:02 AM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3            if(nums.length==0)
4                return 0;
5            
6            int res=1;
7            for(int i=1;i<nums.length;i++){
8                if(nums[i]!=nums[i-1]){
9                    nums[res]=nums[i];
10                    res++;
11                }
12            }
13        return res;
14    }
15}